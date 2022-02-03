/**
* This class includes the declaration and implementation of the sleepIn method,
* as well as the unit testing for the method.
*
* @author NicholasRaynes
* @version 0.0.2
*/
public class SleepIn
{
	public static void main(String[] args) 
  	{
		// Testing all possible outcomes of the sleepIn method.
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, false));
    		System.out.printf("Expected: false\nActual: %s\n", sleepIn(true, false));
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, true));
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(true, true));
  	}
  	
  	/**
  	* Determines if you should sleep in, 
  	* depending on the type of day.
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
