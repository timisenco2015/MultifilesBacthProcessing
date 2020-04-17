package repoTest;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.openHouse.BackendAPIs.Application;

import repo.DataLogRepo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DataLogRepoTest 
{
		 
		@Autowired
		  private DataLogRepo dataLogRepo;

		
		  
		  @Test
		  public void findDataLogDetailsByUserIdTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByUserId("ABC123XYZ"));
		  }
		  
		  
		  @Test
		  public void findDataLogDetailsByLogDateRangTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByLogDateRange("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00"));
		  }
		  
		  
		  @Test
		  public void findDataLogDetailsByLogTypeTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByLogType("CLICK"));
		  }
		  
		  @Test
		  public void findDataLogDetailsByLogDateRangeAndUserIdTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByLogDateRangeAndUserId("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","ABC123XYZ"));
		  }
		  
		  
		  @Test
		  public void findDataLogDetailsByUserIdAndLogTypeTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByUserIdAndLogType("CLICK","ABC123XYZ"));
		  }
		  
		  
		  @Test
		  public void findDataLogDetailsByLogDateRangeAndLogTypeTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByLogDateRangeAndLogType("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","CLICK"));
		  }
		  
		  @Test
		  public void findDataLogDetailsByLogDateRangeAndLogTypeAndUserIdTest()
		  {
			  assertNotNull(dataLogRepo.findDataLogDetailsByLogDateRangeAndLogTypeAndUserId("2018-10-18T00:00:00-00:00","2018-10-18T23:59:00-00:00","CLICK","ABC123XYZ"));
		  }
		  
	}



