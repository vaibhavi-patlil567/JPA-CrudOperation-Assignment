package exceptions;

public class AuthorNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AuthorNotFoundException()
	{
		super();
	}
	public String toString()
	{
		return "Invalid Product ";
	}
}