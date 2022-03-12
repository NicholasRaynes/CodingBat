public class StartHi
{
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
