public class StringTimes
{
  public static void main(String[] args)
  {
      // Testing
      System.out.printf("Test #1 - stringTimes('Hi', 2)\nOutput:%s\n", stringTimes("Hi", 2));
      System.out.printf("Test #2 - stringTimes('Hi', 3)\nOutput:%s\n", stringTimes("Hi", 3));
      System.out.printf("Test #3 - stringTimes('Hi', 1)\nOutput:%s\n", stringTimes("Hi", 1));
  }
  
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
