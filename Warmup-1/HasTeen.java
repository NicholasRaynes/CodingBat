public class HasTeen
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - hasTeen(13, 20, 10)");
    	System.out.printf("Output: %b\n", hasTeen(13, 20, 10));
    	
    	System.out.println("Test #2 - hasTeen(20, 19, 10)");
    	System.out.printf("Output: %b\n", hasTeen(20, 19, 10));
    	
    	System.out.println("Test #3 - hasTeen(20, 10, 13)");
    	System.out.printf("Output: %b\n", hasTeen(20, 10, 13));
    }
    
    public static boolean hasTeen(int a, int b, int c) 
    {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
