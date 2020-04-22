package controller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import javax.batch.operations.JobRestartException;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.openHouse.BackendAPIs.Application;
import domain.Container;
import exception.FileNotFoundExceptions;
import exception.ParseExceptions;
import exception.RestExceptionHandler;
import service.DataLogService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/openHouseAPIs")
public class DataLogController<T> {

	@Autowired
	DataLogService dataLogService;
	
	 RestExceptionHandler  restExceptionHandler = new  RestExceptionHandler();

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job clientJob;

	// imports data log files and calls JobLauncher. The Joblauncher start the job. Jobparameter is used to pass
	@SuppressWarnings("unchecked")
	// paramters to Job
	@PostMapping("/importDataLogFiles")
	@ResponseBody
	public Container<T> loadDataLogFiles(@RequestBody HashMap<String, Object> fileLocation) 
			
	{
		
		JobExecution jobExecution=null;
		
		Container<T> containerObject=null;
		
		
		
		try 
		{
			Application.getLogger().info("User called import Data Log Files (importDataLogFiles) details api. parameters passed is: "+fileLocation.get("fileName").toString());
			 
			JobParametersBuilder builder = new JobParametersBuilder();
			
			builder.addString("fileName", fileLocation.get("fileName").toString());

			jobExecution = jobLauncher.run(clientJob, builder.toJobParameters());

			System.out.println("JobExecution: " + jobExecution.getStatus());

			System.out.println("Batch is Running...");

			while (jobExecution.isRunning()) 
			{

				System.out.println("...");

			}

	      
	        final ExitStatus status = jobExecution.getExitStatus();

	         if (ExitStatus.FAILED.getExitCode().equals(
	                        status.getExitCode())) 
	        {
	        	
	        	final List<Throwable> exceptions = jobExecution.getAllFailureExceptions();
	        	    
	        	for (final Throwable throwable : exceptions) 
	        	{
	        		
	        		
	        		
	        		if (throwable instanceof FileNotFoundException)
	        		{
	        			throw new FileNotFoundExceptions(throwable.getMessage(), throwable.getCause(), HttpStatus.NOT_FOUND);
	        			
	        		}
	        		else if (throwable instanceof ParseException)
	        		{
	        			
	        			throw new ParseExceptions(throwable.toString(), throwable.getCause(), HttpStatus.RESET_CONTENT);
	        		}
	        		
	             }
	        	
	        }
	         
	         else
	         {
	        	 containerObject =  (Container<T>) new Container<BatchStatus>(jobExecution.getStatus(),"Class Object");
	     		
	         }
		}
		catch (JobExecutionAlreadyRunningException ex) 
		{

	        
		} 
		catch (JobRestartException ex) 
		{

	        
		} 
		catch (JobInstanceAlreadyCompleteException ex) 
		{

	    } 
		catch (JobParametersInvalidException ex) 
		{

	    } catch (org.springframework.batch.core.repository.JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally 
		{

	    }

	 
		return containerObject; 
    	
    	
       
		

		

	}

	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByLogDateRange")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRange(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRange(startDate, endDate);
	
	}

	// fetches data logs using log type criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogType(@RequestParam("logType") String logType) 
	{
		
		return dataLogService.getDataLogDetailsByLogType(logType);
	
	}

	// fetches data logs using log date range (startDate and endDate) and UserId criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByLogDateRangeAndUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndUserId(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndUserId(startDate, endDate, userId);
	
	}
	
	
	// fetches data logs using log type and UserId criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByUserIdAndLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByUserIdAndLogType(@RequestParam("logType") String logType,
			@RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByUserIdAndLogType(logType, userId);
	
	}

	// fetches data logs using UserId criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByUserId(@RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByUserId(userId);
	
	}

	// fetches data logs using log date range (startDate and endDate) and log type criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByLogDateRangeAndLogType")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogType(@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("logType") String logType) 
	{
	
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndLogType(startDate, endDate, logType);
	
	}

	// fetches data logs using log date range (startDate and endDate), log type and UserId criteria
	@SuppressWarnings("hiding")
	@GetMapping("/dataLogDetailsByLogDateRangeAndLogTypeAndUserId")
	@ResponseBody
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate,
			@RequestParam("logType") String logType, @RequestParam("userId") String userId) 
	{
		
		return dataLogService.getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(startDate, endDate, logType, userId);
	
	}

}
