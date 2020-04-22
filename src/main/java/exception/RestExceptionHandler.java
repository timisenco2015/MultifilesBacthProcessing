package exception;



import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.dao.CannotSerializeTransactionException;
import org.springframework.dao.CleanupFailureDataAccessException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessResourceException;
import org.springframework.dao.TypeMismatchDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.jca.cci.CciOperationNotSupportedException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.jdbc.LobRetrievalFailureException;
import org.springframework.jdbc.SQLWarningException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.jdbc.datasource.init.ScriptParseException;
import org.springframework.jdbc.datasource.init.ScriptStatementFailedException;
import org.springframework.jdbc.datasource.init.UncategorizedScriptException;
import org.springframework.jdbc.datasource.lookup.DataSourceLookupFailureException;
import org.springframework.jdbc.support.xml.SqlXmlFeatureNotImplementedException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import error.ApiError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;



@ControllerAdvice
@EnableWebMvc
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{

    
    
    @Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
    {
    	
    	ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleMissingServletRequestPart(MissingServletRequestPartException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status,
			WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex,
			HttpHeaders headers, HttpStatus status, WebRequest webRequest) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) 
	{
		ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	@ExceptionHandler(FileNotFoundExceptions.class)
	public ResponseEntity<Object> handleMethodFileNotFoundExceptions(FileNotFoundExceptions ex) 
    {
    	
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage(ex.getLocalizedMessage());
        apiError.setDebugMessage(ex.getMessage());
      
        return buildResponseEntity(apiError);
    }
    
    
    @ExceptionHandler(ParseExceptions.class)
  	public ResponseEntity<Object> handleMethodParseException(ParseExceptions ex) 
    {
      	ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
      
    }
    
    
    
  	public ResponseEntity<Object> handleMethodGeneralException(Exception ex) 
    {
      	ApiError apiError = new ApiError(HttpStatus.RESET_CONTENT);
      	apiError.setMessage(ex.getLocalizedMessage());
      	apiError.setDebugMessage(ex.getMessage());
        
      	return buildResponseEntity(apiError);
      
    }
    
    
    public ResponseEntity<Object>	handleDataAccessException(DataAccessException dataAccessException)  
    {
		
		if (dataAccessException instanceof CannotAcquireLockException) 
		{
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		
		}
		
		else if (dataAccessException instanceof RecoverableDataAccessException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof ScriptParseException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof ScriptStatementFailedException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof UncategorizedScriptException) 
		{	
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		
			
		else if (dataAccessException instanceof CannotAcquireLockException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
		
		}
			
			
		else if (dataAccessException instanceof CannotSerializeTransactionException)
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof CleanupFailureDataAccessException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof CannotAcquireLockException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
		}
			
			
		else if (dataAccessException instanceof DeadlockLoserDataAccessException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
	
		else if (dataAccessException instanceof TransientDataAccessResourceException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof DuplicateKeyException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof IncorrectResultSetColumnCountException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof EmptyResultDataAccessException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof LobRetrievalFailureException)
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		
		else if (dataAccessException instanceof DataSourceLookupFailureException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof InvalidDataAccessApiUsageException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
		}
			
		else if (dataAccessException instanceof BadSqlGrammarException)
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof CciOperationNotSupportedException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof IncorrectUpdateSemanticsDataAccessException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
			
		else if (dataAccessException instanceof TypeMismatchDataAccessException)
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		/*else if (dataAccessException instanceof CannotCreateRecordException) 
		{
			
				return new ApiError("Persistence Error", "");
			
		}
			
		*/	
			
		
		else if (dataAccessException instanceof CannotGetJdbcConnectionException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
		else if (dataAccessException instanceof PermissionDeniedDataAccessException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
			
		else if (dataAccessException instanceof SQLWarningException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof UncategorizedSQLException) 
		{
				
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else if (dataAccessException instanceof SqlXmlFeatureNotImplementedException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
		
		else if (dataAccessException instanceof SqlXmlFeatureNotImplementedException) 
		{
			
			ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
	        
			apiError.setMessage(dataAccessException.getLocalizedMessage());
	        
			apiError.setDebugMessage(dataAccessException.getMessage());
	      
	        return buildResponseEntity(apiError);
			
		}
			
			
		else 
			
		{
				
			if(dataAccessException.getCause().getClass().getSimpleName().equalsIgnoreCase("ConstraintViolationException"))	
			{
					
					
				ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
		        
				apiError.setMessage(dataAccessException.getLocalizedMessage());
		        
				apiError.setDebugMessage(dataAccessException.getMessage());
		      
		        return buildResponseEntity(apiError);
				
			}
				
			else
				
			{
					
				ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
		        
				apiError.setMessage(dataAccessException.getLocalizedMessage());
		        
				apiError.setDebugMessage(dataAccessException.getMessage());
		      
		        return buildResponseEntity(apiError);
					
				
			}
		}
				
	}
		


    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}