public class MiddleThree
{
    public static String middleThree(String str)
    {
        int len = str.length() / 2;
        	  
        return str.substring(len - 1,len + 2);
    }
}
