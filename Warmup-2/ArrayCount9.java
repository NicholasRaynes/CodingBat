/**
* This class includes the declaration, implementation, and testing for
* the arrayCount9 method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p184031
*/

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
  
  /**
  * Given an array of ints, return the number of 9's in the array.
  *
  * @param nums The array to be searched through.
  * @return count How many times the integer 9 is present within the array provided.
  */
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
