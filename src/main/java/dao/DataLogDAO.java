package dao;

import domain.Container;



public interface DataLogDAO<T> 
{
	public Container<T> getDataLogDetailsByUserId(String userId);
	
	public Container<T> getDataLogDetailsByLogDateRange(String startDate, String endDate);
	
	public Container<T> getDataLogDetailsByLogType(String logType);
	
	public Container<T> getDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId);
	
	public Container<T> getDataLogDetailsByUserIdAndLogType(String logType,String userId );

	public Container<T> getDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType);
	
	public Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId);
	
}
