public class ExtraEnd
{
  public static void main(String[] args)
  {
    // Testing
    System.out.println("Test #1 - extraEnd('Hello')");
    System.out.printf("Output: %s\n", extraEnd("Hello"));
    
    System.out.println("Test #2 - extraEnd('ab')");
    System.out.printf("Output: %s\n", extraEnd("ab"));
    
    System.out.println("Test #3 - extraEnd('Test')");
    System.out.printf("Output: %s\n", extraEnd("Test"));
  }
  
  public static String extraEnd(String str) 
  {
    String lastTwo = "";
  
    if(str.length() >= 2)
    {
      lastTwo = str.substring(str.length() - 2);
    }
  
    lastTwo.toLowerCase();
    
    return lastTwo + lastTwo + lastTwo;
  }
}
