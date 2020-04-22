package batch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import daoImp.DatabaseSequenceDAOImpl;
import domain.Container;
import dto.DataLogDetails;



//Custom ItemReader Class
public class CustomItemReader<T> implements ItemReader<DataLogDetails> 
{

	Resource resource;

	private ItemReader<DataLogDetails> delegate;
	
	Container<T> genericObject=null; 


	@Autowired
	DatabaseSequenceDAOImpl databaseSequenceDAOImpl;

	public CustomItemReader(Resource resource) 
	{
		this.resource = resource;
	}
	
	
	 @Override
	 public DataLogDetails read() throws Exception 
	 {
	       if (delegate == null) 
	       {
	         delegate = new IteratorItemReader<>(dataLogDetails());
	       }
	       
	       return delegate.read();
	 }
	 
	 
	 // reads data from the file and parsed to JSONObject
	 private List<DataLogDetails> dataLogDetails() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException 
	 {
		 List<DataLogDetails> dataLogDetailsList = new ArrayList<>();
		
		 	FileReader reader = new FileReader(resource.getFile());
	        
		 	JSONParser parser = new JSONParser();
		 		
	        JSONObject dataLogDetailsObject = (JSONObject) parser.parse(reader);
	          
	        dataLogDetailsList.add(parseDataLogDetailsObject(dataLogDetailsObject));
		
		 	return dataLogDetailsList;
		
	    }
	 


	//parse json object read from the file to DTO DataLogDetails
	@SuppressWarnings("unused")
	private DataLogDetails parseDataLogDetailsObject(JSONObject dataLogDetailsObject) 
    {
		
		DataLogDetails dataLogDetails = new DataLogDetails();
		
		dataLogDetails.setId(databaseSequenceDAOImpl.generateSequence(DataLogDetails.SEQUENCE_NAME));

		dataLogDetails.setUserId(dataLogDetailsObject.get("userId").toString());

		dataLogDetails.setSessionId(dataLogDetailsObject.get("sessionId").toString());

		dataLogDetails.setActions((JSONArray) dataLogDetailsObject.get("actions"));
		
		return dataLogDetails;
      
        
    }

}