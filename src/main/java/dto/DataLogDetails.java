package dto;


import org.springframework.data.mongodb.core.mapping.Document;
import org.json.simple.JSONArray;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Document(collection = "datalogdetails")
public class DataLogDetails 
{

    @Transient
    public static final String SEQUENCE_NAME = "data_log_details_sequence";
	
	@Id
    private long id;

	private String  userId;
    	
	private String  sessionId; 
    	
	private JSONArray actions;

	public long getId() 
	{
		
		return id;
		
	}

	public void setId(long id) 
	{
		
		this.id = id;
		
	}

	public String getUserId() 
	{
		
		return userId;
		
	}

	public void setUserId(String userId) 
	{
		
		this.userId = userId;
		
	}

	public String getSessionId() 
	{
		
		return sessionId;
		
	}

	public void setSessionId(String sessionId) 
	{
		
		this.sessionId = sessionId;
		
	}

	public JSONArray getActions() 
	{
		
		return actions;
		
	}

	public void setActions(JSONArray actions) 
	{
		
		this.actions =actions;
		
	}
	
	
	
}
