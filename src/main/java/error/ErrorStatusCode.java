package error;

public class ErrorStatusCode 
{
	
	public static int CONTINUE_CODE = 100;
	public static String CONTINUE_MESSAGE = "Only a part of the request has been received by the server, but as long as it has not been rejected, the client should continue with the request";
	
	public static int SWITCHING_PROTOCOLS_CODE = 101;
	public static String SWITCHING_PROTOCOLS_MESSAGE = "The server switches protocol.";
	
	public static int OK_CODE = 200;
	public static String OK_MESSAGE="The request is OK ";
	
	public static int CREATED_CODE = 201;
	public static String CREATED_MESSAGE = "The request is complete, and a new resource is created";
	
	public static int ACCEPTED_CODE = 202;
	public static String ACCEPTED_MESSAGE = "The request is accepted for processing, but the processing is not complete.";
	
	public static int NON_AUTHORIATIVE_INFORMATION_CODE = 203;
	public static String NON_AUTHORIATIVE_INFORMATION_MESSAGE = "";
	
	public static int NO_CONTENT_CODE = 204;
	public static String NO_CONTENT_MESSAGE="";
	
	public static int RESET_CONTENT_CODE = 205;
	public static String RESET_CONTENT_MESSAGE="";
	
	public static int PARTIAL_CONTENT_CODE = 206;
	public static String PARTIAL_CONTENT_MESSAGE ="";
	
	public static int MULTIPLES_CHOICES_CODE = 300;
	public static String  MULTIPLES_CHOICES_MESSAGE = "A link list. The user can select a link and go to that location. Maximum five addresses";
	
	
	public static int MOVED_PERMANENTLY_CODE= 301;
	public static String MOVED_PERMANENTLY_MESSAGE = "The requested page has moved to a new url";
	
	
	public static int FOUND_CODE=302;
	public static String FOUND_MESSAGE= "The requested page has moved temporarily to a new url";
	
	public static int SEE_OTHER_CODE = 303;
	public static String SEE_OTHER_MESSAGE = "The requested page can be found under a different url";
	
	public static int NOT_MODIFIED_CODE = 304;
	public static String NOT_MODIFIED_MESSAGE="";
	
	public static int USE_PROXY_CODE = 305;
	public static String USE_PROXY_CODE_MESSAGE="";
	
	public static int UNUSED_CODE=306;
	public static String UNUSED_MESSAGE ="This code was used in a previous version. It is no longer used, but the code is reserved";
	
	public static int TEMPORARY_REDIRECT_CODE = 307;
	public static String  TEMPORARY_REDIRECT_MESSAGE="The requested page has moved temporarily to a new url.";
	
	public static int BAD_REQUEST_CODE = 400;
	public static String BAD_REQUEST_MESSAGE= "The server did not understand the request";
	
	public static int UNAUTHORIZED_CODE = 401;
	public static String UNAUTHORIZED_MESSAGE="The requested page needs a username and a password ";
	
	public static int PAYMENT_REQUIRED_CODE = 402;
	public static String PAYMENT_REQUIRED_MESSAGE="You cannot use this code yet";
	
	public static int FORBIDDEN_CODE = 403;
	public static String FORBIDDEN_MESSAGE="Access is forbidden to the requested page";
	
	public static int NOT_FOUND_CODE = 404;
	public static String NOT_FOUND_MESSAGE="The server cannot find the requested page.";
	
	public static int METHOD_NOT_ALLOWED_CODE = 405;
	public static String METHOD_NOT_ALLOWED_MESSAGE = "The method specified in the request is not allowed";
	
	
	public static int NOT_ACCEPTABLE_CODE = 406;
	public static String NOT_ACCEPTABLE_MESSAGE = "The server can only generate a response that is not accepted by the client";
	
	
	public static int PROXY_AUTHENTICATION_REQUIRED_CODE = 407;
	public static String PROXY_AUTHENTICATION_REQUIRED_MESSAGE = "You must authenticate with a proxy server before this request can be served.";
	
	public static int REQUEST_TIMEOUT_CODE = 408;
	public static String REQUEST_TIMEOUT_MESSAGE = "The request took longer than the server was prepared to wait.";
	
	public static int CONFLIT_CODE = 409;
	public static String CONFLIT_MESSAGE = "The request could not be completed because of a conflict.";
	
	public static int GONE_CODE = 410;
	public static String GONE_MESSAGE = "The requested page is no longer available.";
	
	
	public static int LENGTH_REQUIRED_CODE = 411;
	public static String LENGTH_REQUIRED_MESSAGE = "The \"Content-Length\" is not defined. The server will not accept the request without it.";
	
	public static int PRECONDITION_FAILED_CODE = 412;
	public static String PRECONDITION_FAILED_MESSAGE = "The precondition given in the request evaluated to false by the server.";
	

	public static int REQUEST_ENTITY_TOO_LARGE_CODE = 413;
	public static String REQUEST_ENTITY_TOO_LARGE_MESSAGE = "The server will not accept the request, because the request entity is too large.";
	
	
	public static int REQUEST_URL_TOO_LONG_CODE = 414;
	public static String REQUEST_URL_TOO_LONG_MESSAGE = "The server will not accept the request, because the url is too long. Occurs when you convert a \"post\" request to a \"get\" request with a long query information.";
	
	public static int UNSUPPORTED_MEDIA_TYPE_CODE = 415;
	public static String UNSUPPORTED_MEDIA_TYPE_MESSAGE = "The server will not accept the request, because the media type is not supported.";
	
	public static int EXPECTATION_FAILED_CODE = 417;
	public static String EXPECTATION_FAILED_MESSAGE = "";
	
	
	public static int INTERNAL_SERVER_ERROR_CODE = 500;
	public static String INTERNAL_SERVER_ERROR_MESSAGE = "The request was not completed. The server met an unexpected condition.";
	
	public static int NOT_IMPLEMENTED_CODE = 501;
	public static String NOT_IMPLEMENTED_MESSAGE = "The request was not completed. The server did not support the functionality required.";
	
	
	public static int BAD_GATEWAY_CODE = 502;
	public static String BAD_GATEWAY_MESSAGE = "The request was not completed. The server received an invalid response from the upstream server";
	
	public static int SERVICE_UNAVAILABLE_CODE = 503;
	public static String SERVICE_UNAVAILABLE_MESSAGE = "The request was not completed. The server is temporarily overloading or down.";
	
	public static int GATEWAY_TIMEOUT_CODE = 504;
	public static String GATEWAY_TIMEOUT_MESSAGE = "The gateway has timed out.";
	
	public static int HTTP_VERSION_NOT_SUPPORTED_CODE = 505;
	public static String HTTP_VERSION_NOT_SUPPORTED_MESSAGE = "The server does not support the \"http protocol\" version.";
	
}
