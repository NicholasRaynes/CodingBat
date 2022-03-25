public class FirstHalf
{
    public static String firstHalf(String str) 
    {
        String half = "";
  
        half = str.substring(0, str.length() / 2);

        return half;
    }
}
