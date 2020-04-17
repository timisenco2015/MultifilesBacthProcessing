package controller;

import java.io.IOException;
import java.util.HashMap;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import domain.Container;
import service.DataLogService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/openHouseAPIs")
public class DataLogController {

	@Autowired
	DataLogService dataLogService;

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job clientJob;

	// imports data log files and calls JobLauncher. The Joblauncher start the job. Jobparameter is used to pass
	// paramters to Job
	@PostMapping("/importDataLogFiles")
	@ResponseBody
	public <T> BatchStatus loadDataLogFiles(@RequestBody HashMap<String, Object> fileLocation)
			throws IOException, Exception 
	{

		JobParametersBuilder builder = new JobParametersBuilder();
		
		builder.addString("fileName", fileLocation.get("fileName").toString());

		JobExecution jobExecution = jobLauncher.run(clientJob, builder.toJobParameters());

		System.out.println("JobExecution: " + jobExecution.getStatus());

		System.out.println("Batch is Running...");

		while (jobExecution.isRunning()) 
		{

			System.out.println("...");

		}

		return jobExecution.getStatus();

	}

	@GetMapping("/dataLogDetailsByLogDateRange")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRange(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRange(startDate, endDate);
	
	}

	// fetches data logs using log type criteria
	@GetMapping("/dataLogDetailsByLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogType(@RequestParam("logType") String logType) 
	{
		
		return dataLogService.getDataLogDetailsByLogType(logType);
	
	}

	// fetches data logs using log date range (startDate and endDate) and UserId criteria
	@GetMapping("/dataLogDetailsByLogDateRangeAndUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndUserId(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndUserId(startDate, endDate, userId);
	
	}
	
	
	// fetches data logs using log type and UserId criteria
	@GetMapping("/dataLogDetailsByUserIdAndLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByUserIdAndLogType(@RequestParam("logType") String logType,
			@RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByUserIdAndLogType(logType, userId);
	
	}

	// fetches data logs using UserId criteria
	@GetMapping("/dataLogDetailsByUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByUserId(@RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByUserId(userId);
	
	}

	// fetches data logs using log date range (startDate and endDate) and log type criteria
	@GetMapping("/dataLogDetailsByLogDateRangeAndLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogType(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("logType") String logType) 
	{
	
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndLogType(startDate, endDate, logType);
	
	}

	// fetches data logs using log date range (startDate and endDate), log type and UserId criteria
	@GetMapping("/dataLogDetailsByLogDateRangeAndLogTypeAndUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate,
			@RequestParam("logType") String logType, @RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(startDate, endDate, logType, userId);
	
	}

}
