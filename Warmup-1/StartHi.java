public class StartHi
{
  public static void main(String[] args)
  {
    // Testing
    System.out.println("Test #1 - startHi('hi there')");
    System.out.printf("Output: %b\n", startHi("hi there"));
    	
    System.out.println("Test #2 - startHi('hi')");
    System.out.printf("Output: %b\n", startHi("hi"));
    	
    System.out.println("Test #3 - startHi('hello hi')");
    System.out.printf("Output: %b\n", startHi("hello hi"));
  }
  
  public static boolean startHi(String input) 
  {
    if (input.length() < 2) 
    {
        return false;
    }
  
    String firstTwo = input.substring(0, 2);
  
    if (firstTwo.equals("hi")) 
    {
        return true;
    } 
    else 
    {
        return false;
    }
  }
}
