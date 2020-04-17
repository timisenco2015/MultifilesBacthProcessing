package domainTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.openHouse.BackendAPIs.Application;

import domain.Container;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ContainerTest 
{
	// Test for Generic class
	@Test
	public void testSettersGetters() 
	{
		
		Map<String, Object> errorMap = new HashMap<String, Object>();
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Container container = new  Container(errorMap,"Test Object");
		
		
		assertNotNull(container.getObject());
		assertEquals("Test Object", container.getObjectType());
		
	}

}
