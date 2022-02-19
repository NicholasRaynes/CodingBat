public class StringTimes
{
  public static String stringTimes(String input, int factor) 
  {
    String output = "";
  
    for (int i=0; i < factor; i++) 
    {
      output += input;  
    }
    
    return output;
  }
}
