package serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.DataLogDAO;
import domain.Container;
import service.DataLogService;


@Service("DataLogService")
public class DataLogServiceImpl implements DataLogService
{
	@SuppressWarnings("rawtypes")
	@Autowired
	private DataLogDAO dataLogDAO;
	

	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByLogDateRange(String startDate, String endDate)
	{
		return dataLogDAO.getDataLogDetailsByLogDateRange(startDate, endDate);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByLogType(String logType)
	{
		return dataLogDAO.getDataLogDetailsByLogType(logType);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId)
	{
		return dataLogDAO.getDataLogDetailsByLogDateRangeAndUserId(startDate,endDate,userId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByUserIdAndLogType(String logType,String userId )
	{
		return dataLogDAO.getDataLogDetailsByUserIdAndLogType(logType,userId);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType)
	{
		return dataLogDAO.getDataLogDetailsByLogDateRangeAndLogType(startDate, endDate,logType);
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId)
	{
		return dataLogDAO.getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(startDate, endDate,logType,userId);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Container<T> getDataLogDetailsByUserId(String userId) 
	{
		
		return dataLogDAO.getDataLogDetailsByUserId(userId);
		
		
	}
	
	
}
