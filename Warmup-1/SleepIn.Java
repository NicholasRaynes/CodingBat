/**
* This class includes the declaration, implementation, and unit testing for
* the sleepIn method.
*
* @author NicholasRaynes
* @version 0.0.2
*/
public class SleepIn
{
	public static void main(String[] args) 
  	{
		// Testing all possible outcomes of the sleepIn method.
		System.out.println("Test #1 - It is isn't a weekday, isn't a vacation day.\n");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, false));
		
		System.out.println("Test #2 - It is a weekday, isn't a vacation day.\n");
    		System.out.printf("Expected: false\nActual: %s\n", sleepIn(true, false));
		
		System.out.println("Test #3 - It is isn't a weekday, it is a vacation day.\n");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, true));
		
		System.out.println("Test #4 - It is a weekday, It is a vacation day\n");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(true, true));
  	}
  	
  	/**
  	* Determines if you should sleep in, 
  	* depending on the type of day. Possible types of
	* days are weekday and vacation.
  	*
  	* @param weekday Whether or not it is a weekday.
  	* @param vacation Whether or not it is a vacation day.
  	*/
  	public static boolean sleepIn(boolean weekday, boolean vacation) 
  	{
    		if (!weekday || vacation) 
    		{
      			return true;
    		}
    		return false;
  	}
}
