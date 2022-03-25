public class FirstHalf
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - firstHalf('WooHoo')");
        System.out.printf("Output: %s\n", firstHalf("WooHoo"));
        
        System.out.println("Test #2 - firstHalf('HelloThere')");
        System.out.printf("Output: %s\n", firstHalf("HelloThere"));
        
        System.out.println("Test #3 - firstHalf('abcdef')");
        System.out.printf("Output: %s\n", firstHalf("abcdef"));
    }
    
    public static String firstHalf(String str) 
    {
        String half = "";
  
        half = str.substring(0, str.length() / 2);

        return half;
    }
}
