package exception;

import org.springframework.http.HttpStatus;


public class FileNotFoundExceptions extends RuntimeException 
{

	private static final long serialVersionUID = 7718828512143293558L;
	
	
	private final HttpStatus code;

	public FileNotFoundExceptions(HttpStatus code) 
	{
		super();
		this.code = code;
	}

	
	
	
	public FileNotFoundExceptions(String message, Throwable cause, HttpStatus code) {
		super(message, cause);
		this.code = code;
	}

	public FileNotFoundExceptions(String message, HttpStatus code) {
		super(message);
		this.code = code;
	}

	public FileNotFoundExceptions(Throwable cause, HttpStatus code) 
	{
		super(cause);
		this.code = code;
	}
	
	public HttpStatus getCode() 
	{
		return this.code;
	}
}
