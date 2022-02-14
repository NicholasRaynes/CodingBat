public class ArrayCount9
{
  public static void main(String[] args)
  {
    // Testing
    int[] test1 = {1, 2, 9};
    int[] test2 = {1, 9, 9};
    int[] test3 = {1, 9, 9, 3, 9};
    
    System.out.printf("Test #1 - arrayCount9([1, 2, 9])\nOutput:%d\n", arrayCount9(test1));
    System.out.printf("Test #2 - arrayCount9([1, 9, 9])\nOutput:%d\n", arrayCount9(test2));
    System.out.printf("Test #3 - arrayCount9([1, 9, 9, 3, 9])\nOutput:%d\n", arrayCount9(test3));
  }
  public static int arrayCount9(int[] nums)
  {
    int count = 0;
  
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] == 9)
      {
        count++;
      }
    }
  
    return count;
  }
}
