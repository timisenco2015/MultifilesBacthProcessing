package service;


import domain.Container;


public interface DataLogService 
{
	public <T> Container<T> getDataLogDetailsByUserId(String userId);
	
	public <T> Container<T> getDataLogDetailsByLogDateRange(String startDate, String endDate);
	
	public <T> Container<T> getDataLogDetailsByLogType(String logType);
	
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId);
	
	public <T> Container<T> getDataLogDetailsByUserIdAndLogType(String logType,String userId );

	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType);
	
	public <T> Container<T> getDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId);
	
	
	
}
