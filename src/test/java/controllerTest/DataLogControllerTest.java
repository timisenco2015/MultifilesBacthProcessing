package controllerTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openHouse.BackendAPIs.Application;
import controller.DataLogController;
import service.DataLogService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class DataLogControllerTest 
{
	 	
	@Autowired
	private MockMvc mockMvc;
		
	@Mock
	private DataLogService dataLogService;
		
	@InjectMocks
	private DataLogController dataLogController;
		
	@Before
	public void setUp() throws Exception
	{
			
		mockMvc = MockMvcBuilders.standaloneSetup(dataLogController).build();

	}

	// This is test class uses MockMvc for post and get request in controller file
		
		@Test
		public void testDataLogDetailsByLogDateRangeAndLogTypeAndUserId() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByLogDateRangeAndLogTypeAndUserId")
				      .param("logType", "CLICK")
				      .param("startDate", "2018-10-18T00:00:00-00:00")
				      .param("endDate", "2018-10-18T23:59:00-00:00")
				      .param("userId", "ABC123XYZ")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		
		
		@Test
		public void testDataLogDetailsByLogDateRangeAndLogType() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByLogDateRangeAndLogType")
				      .param("logType", "CLICK")
				      .param("startDate", "2018-10-18T00:00:00-00:00")
				      .param("endDate", "2018-10-18T23:59:00-00:00")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		
		@Test
		public void testDataLogDetailsByUserId() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByUserId")
				      .param("userId", "ABC123XYZ")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		
		@Test
		public void testDataLogDetailsByUserIdAndLogTyped() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByUserIdAndLogType")
				      .param("logType", "CLICK")
				      .param("userId", "ABC123XYZ")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		
		@Test
		public void testDataLogDetailsByLogDateRangeAndUserId() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByLogDateRangeAndUserId")
				      .param("startDate", "2018-10-18T00:00:00-00:00")
				      .param("endDate", "2018-10-18T23:59:00-00:00")
				      .param("userId", "ABC123XYZ")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		@Test
		public void testDataLogDetailsByLogType() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByLogType")
				      .param("logType", "CLICK")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}

		
		@Test
		public void testDataLogDetailsByLogDateRange() throws Exception
		{
			
			
			mockMvc.perform( MockMvcRequestBuilders
				      .get("/openHouseAPIs/dataLogDetailsByLogDateRange")
				      .param("startDate", "2018-10-18T00:00:00-00:00")
				      .param("endDate", "2018-10-18T23:59:00-00:00")
				      .accept(MediaType.APPLICATION_JSON))
			   			.andExpect(status().isOk());
				     
		
		}
		
		public static String asJsonString(final Object obj) {
		    try {
		        return new ObjectMapper().writeValueAsString(obj);
		    } catch (Exception e) {
		        throw new RuntimeException(e);
		    }
		}
		

}
