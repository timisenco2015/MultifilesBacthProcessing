package daoImp;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dao.DataLogDAO;
import domain.Container;
import dto.DataLogDetails;
import repo.DataLogRepo;




@Repository
public class DataLogDAOlmpl<T> implements DataLogDAO<T> 
{
	@Autowired
	DataLogRepo dataLogRepo;
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByUserId(String userId)
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		

		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByUserId(userId);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			return  (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRange(String startDate, String endDate)
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRange(startDate, endDate);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			return  (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogType(String logType)
	{
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogType(logType);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			
			return  (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId)
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndUserId(startDate,endDate,userId);
			
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			
			return  (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}
	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByUserIdAndLogType(String logType,String userId )
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByUserIdAndLogType(logType,userId );
			
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			return (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}  
	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType)
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndLogType(startDate, endDate,logType);
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			
			return (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}  
	
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId)
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndLogTypeAndUserId(startDate, endDate,logType,userId);
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch(Exception e)
		{
			errorMap.put("Insert Error", "Error Thrown -> "+e.getCause().getCause().getMessage());
			return (Container<T>) new Container<Map<String, Object>>(errorMap,"Error Object");			
			
		}  
	
	}
	
}
