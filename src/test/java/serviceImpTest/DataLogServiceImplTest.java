package serviceImpTest;

import static org.junit.Assert.assertNotNull;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.openHouse.BackendAPIs.Application;

import serviceImp.DataLogServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class DataLogServiceImplTest<T>
{
	
	@Autowired
	DataLogServiceImpl dataLogServiceImpl;
	

	@Test
	public void  getDataLogDetailsByLogDateRangTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByLogDateRange("2018-10-18T00:00:00-00:00", "2018-10-18T23:59:00-00:00"));
	
	}
	
	@Test
	public void  getDataLogDetailsByLogTypeTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByLogType("CLICK"));
	
	}
		
	@Test
	public void  getDataLogDetailsByLogDateRangeAndUserIdTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByLogDateRangeAndUserId("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","ABC123XYZ"));
	
	}	
	
	
	@Test
	public void  getDataLogDetailsByUserIdAndLogTypeTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByUserIdAndLogType("CLICK","ABC123XYZ"));
	
	}
		
	@Test
	public void  getDataLogDetailsByLogDateRangeAndLogTypeTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByLogDateRangeAndLogType("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","CLICK"));
	
	}	
	
	
	
	@Test
	public void  getDataLogDetailsByLogDateRangeAndLogTypeAndUserIdTest() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByLogDateRangeAndLogTypeAndUserId("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","CLICK","ABC123XYZ"));
	}		
		
	@Test
	public void  getDataLogDetailsByUserId() throws JSONException 
	{
		// checks the service implementation method call returns data
		assertNotNull(dataLogServiceImpl.getDataLogDetailsByUserId("ABC123XYZ"));
		
	}	
		

		
		
}

