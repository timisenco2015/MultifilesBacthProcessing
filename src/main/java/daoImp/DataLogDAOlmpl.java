package daoImp;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.openHouse.BackendAPIs.Application;
import dao.DataLogDAO;
import domain.Container;
import dto.DataLogDetails;
import exception.RestExceptionHandler;
import repo.DataLogRepo;




@Repository
public class DataLogDAOlmpl<T> implements DataLogDAO<T> 
{
	@Autowired
	DataLogRepo dataLogRepo;
	
	RestExceptionHandler restExceptionHandler=new RestExceptionHandler();
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByUserId(String userId)
	{
	
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByUserId(userId);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRange(String startDate, String endDate) throws DataAccessException
	{
		
	
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRange(startDate, endDate);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByLogDateRange method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByLogDateRange method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogType(String logType)
	{
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogType(logType);
			
			return  (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId)
	{
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndUserId(startDate,endDate,userId);
			
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}
	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByUserIdAndLogType(String logType,String userId )
	{
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByUserIdAndLogType(logType,userId );
			
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByUserIdAndLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByUserIdAndLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}
	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType)
	{
		
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndLogType(startDate, endDate,logType);
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndLogType method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		} 
	
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId)
	{
		
	
		try 
		{
			List<DataLogDetails> dataLogDetailsList= dataLogRepo.findDataLogDetailsByLogDateRangeAndLogTypeAndUserId(startDate, endDate,logType,userId);
			return (Container<T>) new Container<List<DataLogDetails>>(dataLogDetailsList,"Class Object");
		} 
		catch (DataAccessException dataAccessException) 
		{
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndLogTypeAndUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			 return (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleDataAccessException(dataAccessException),"Error Object");
	
		 
		 }
		catch(Exception exception)
		{
			 
			 Application.getLogger().info("getDataLogDetailsByLogDateRangeAndLogTypeAndUserId method in DataLog DAO Implementation. At this point there is an error that has prevented getting data log details");
			 
			return  (Container<T>) new  Container<ResponseEntity<Object>> (restExceptionHandler.handleMethodGeneralException(exception),"Error Object");
			
		}  
	
	}
	
}
