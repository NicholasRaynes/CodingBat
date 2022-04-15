public class HelloWorld 
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - middleTwo('string')");
        System.out.printf("Output: %s\n", middleTwo("string"));
        
        System.out.println("Test #2 - middleTwo('code')");
        System.out.printf("Output: %s\n", middleTwo("code"));
        
        System.out.println("Test #3 - middleTwo('Practice')");
        System.out.printf("Output: %s\n", middleTwo("Practice"));
    }
    
    public static String middleTwo(String str) 
    {
        int half = str.length() / 2;

        return str.substring(half-1,half+1);
    }
}
