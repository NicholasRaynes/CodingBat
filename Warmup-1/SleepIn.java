/**
* This class includes the declaration, implementation, and testing for
* the sleepIn method.
*
* @author NicholasRaynes
* @version 0.0.2
* @see https://codingbat.com/prob/p187868
*/
public class SleepIn
{
	public static void main(String[] args) 
  	{
		// Testing all possible outcomes of the sleepIn method.
		System.out.println("Test #1 - It is isn't a weekday, isn't a vacation day.");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, false));
		
		System.out.println("\nTest #2 - It is a weekday, isn't a vacation day.");
    		System.out.printf("Expected: false\nActual: %s\n", sleepIn(true, false));
		
		System.out.println("\nTest #3 - It is isn't a weekday, it is a vacation day.");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(false, true));
		
		System.out.println("\nTest #4 - It is a weekday, It is a vacation day.");
    		System.out.printf("Expected: true\nActual: %s\n", sleepIn(true, true));
  	}
  	
  	/**
  	* Determines if you should sleep in, 
  	* depending on the type of day. Possible types of
	* days are weekday and vacation.
  	*
  	* @param weekday Whether or not it is a weekday.
  	* @param vacation Whether or not it is a vacation day.
	* @return Whether or not you should sleep in.
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
