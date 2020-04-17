package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.dao.DeadlockLoserDataAccessException;

import batch.CustomItemReader;
import batch.DataLogDetailsProcessor;
import batch.MongoCustomWriter;
import dto.DataLogDetails;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@Configuration
@EnableBatchProcessing
public class DataLogsFilesBacthProcessingConfig<T> 
{
	
	@Autowired
	MongoCustomWriter mongoCustomWriter;
	
	
	// accepts fil location name from jobParameters. This is/are parameters passed when the job is launched  in 
	//Controller class
	@Bean
	@StepScope
	PathResource inputFileResource(@Value("#{jobParameters[fileName]}") final String fileName) throws Exception
	{
		
		return new PathResource(fileName);
	}
	
	
	// create bean for customItemReader
	@Bean
	@StepScope
	public CustomItemReader<T> customItemReader() throws Exception 
	{
		
		return new CustomItemReader<T>(inputFileResource(null));
		
	}
	
	
	
	// create bean for DataLogDetailsProcess class. The class is used for transforming data read from file.
	// The transformation can either be from Domain object to DTO or From DTO to Domain Object
	@Bean
	@StepScope
	public DataLogDetailsProcessor dataLogDetailsProcessor() throws Exception 
	{
		
		return new DataLogDetailsProcessor();
		
	}
	
	
	//run the the job when called. It reads data from files in chunks of 100 using CustomItemReader.
	// No data transformation done here. So DataLogDetailsProcessor is not doing anything
	// calls MongoCustomWriter which writes the data to database
	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) throws Exception
	{
		
		Step step = stepBuilderFactory.get("readDataLogJSONFiles")
					.<DataLogDetails, DataLogDetails>chunk(100)
					.reader(customItemReader())
					.processor(dataLogDetailsProcessor())
					.writer(mongoCustomWriter)
					.faultTolerant()
					.retryLimit(3)
					.retry(DeadlockLoserDataAccessException.class)
					.build();
		
		return jobBuilderFactory.get("readDataLogJSONFiless")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
	}
	
	
}
