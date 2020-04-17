package dtoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.openHouse.BackendAPIs.Application;
import dto.DataLogDetails;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DataLogDetailsTest 
{
	
	
	@Test
	public void testSettersGetters() 
	{
		
		DataLogDetails dataLogDetails = new DataLogDetails();
		
		//check setter and getter for DataLogDetails DTO
		dataLogDetails.setId(10);
		
		long testResult1 = 10;
		
		assertEquals(testResult1, dataLogDetails.getId());
				
				
		//check setter and getter for user id
		dataLogDetails.setUserId("ABC123XYZ");
		String testResult2 = "ABC123XYZ";
		assertEquals(testResult2, dataLogDetails.getUserId());
				
				
		//check setter and getter for session id
		dataLogDetails.setSessionId("XYZ456ABC");
		String testResult3 = "XYZ456ABC";
		assertEquals(testResult3, dataLogDetails.getSessionId());
				
				
				
		
	}

}
