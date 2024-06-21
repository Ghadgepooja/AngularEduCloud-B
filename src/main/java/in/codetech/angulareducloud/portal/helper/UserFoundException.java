package in.codetech.angulareducloud.portal.helper;

public class UserFoundException extends Exception 

{
	
	public UserFoundException() {
		
		System.out.println("user with this username already exist in database");
	}
	
	public UserFoundException(String msg)
	{
		super(msg);
	}
}
