public class Array667
{
     public static void main(String[] args)
    {
        int[] test1 = {6, 6, 2};
        int[] test2 = {6, 6, 2, 6};
        int[] test3 = {6, 7, 2, 6};
        
        // Testing
        System.out.printf("Test #1 - array667[6, 6, 2]\nOutput:%d\n", array667(test1));
        System.out.printf("Test #2 - array667[6, 6, 2, 6]\nOutput:%d\n", array667(test2));
        System.out.printf("Test #3 - array667[6, 7, 2, 6]\nOutput:%d\n", array667(test3));
    }
    
    public static int array667(int[] nums) 
    {
        int count = 0;
    
        for (int i=0; i < (nums.length-1); i++) 
        {
            if (nums[i] == 6) 
            {
                if (nums[i+1] == 6 || nums[i+1] == 7) 
                {
                    count++;
                }
            }
        }
    
    return count;
    }
}
