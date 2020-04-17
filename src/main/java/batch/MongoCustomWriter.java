package batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import dto.DataLogDetails;
import repo.DataLogRepo;


// write DTO to Mongo databse by calling repo class that implement MongoRepo
@Component
public class MongoCustomWriter implements ItemWriter<DataLogDetails>
{

	
	@Autowired
	DataLogRepo dataLogRepo;
	
	
	
	
	//saves List of DataLogDetails using repo into mongo databse
	@Override
	public void write(List<? extends DataLogDetails> items) throws Exception 
	{
		
		System.out.println("data log details "+ items.get(0).getUserId());
		dataLogRepo.saveAll(items);
		
	}
	
	
}
