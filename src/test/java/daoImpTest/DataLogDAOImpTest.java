package daoImpTest;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.openHouse.BackendAPIs.Application;

import daoImp.DataLogDAOlmpl;
import domain.Container;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DataLogDAOImpTest<T> {
	
	 @SuppressWarnings("rawtypes")
	@Autowired
	 DataLogDAOlmpl dataLogDAOlmpl;
	
	
	 //test if the method returns log data by using date range, log type, and user id as search criteria 
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByLogDateRangeAndLogTypeAndUserIdTest() 
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByLogDateRangeAndLogTypeAndUserId("2018-10-18T00:00:00-00:00", "2018-10-18T23:59:00-00:00","CLICK","ABC123XYZ") ;
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject());
			  
							
		}
		
	}
	
	//test if the method returns log data by using date range and log type as search criteria 
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByLogDateRangeAndLogTypeTest() 
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByLogDateRangeAndLogType("2018-10-18T00:00:00-00:00", "2018-10-18T23:59:00-00:00","CLICK") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject());
			 
							
		}
		
	}
	
	
	//test if the method returns log data by using log type and  user id  as search criteria
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByUserIdAndLogTypeTest() 
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByUserIdAndLogType("CLICK","ABC123XYZ") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 assertNotNull(dataLogDetailsContainer.getObject());
			 	 
							
		}
		
	}
	
	
	//test if the method returns log data by using log type as search criteria
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByLogDateRangeAndUserIdTest() 
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByLogDateRangeAndUserId("2018-10-18T00:00:00-00:00", "2018-10-18T23:59:00-00:00","ABC123XYZ") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject());
			 
							
		}
		
	}
			 
	
	//test if the method returns log data by using log type as search criteria
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByLogTypeTest()
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByLogType("CLICK") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject()); 
							
		}
		
	}
	
	//test if the method returns log data by using date range as search criteria 
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByLogDateRangeTest()
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByLogDateRange("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject());
			 				
		}
		
	}
	
	
	//test if the method returns log data by using user id as search criteria 
	@SuppressWarnings("unchecked")
	@Test
	public void getDataLogDetailsByUserIdTest()
	{
			
			
		Container<T> dataLogDetailsContainer =dataLogDAOlmpl.getDataLogDetailsByUserId("ABC123XYZ") ;
		
		String typeOfObject = dataLogDetailsContainer.getObjectType();
		
		if(typeOfObject.equalsIgnoreCase("Class Object"))
		{
			 
			 assertNotNull(dataLogDetailsContainer.getObject());
			 				
		}
		
	}
	
}
