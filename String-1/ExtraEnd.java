public class ExtraEnd
{
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
