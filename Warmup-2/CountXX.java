public class CountXX
{
  public static void main(String[] args)
  {
    // Testing
    System.out.printf("Test #1 - countXX('abcxx')\nOutput:%s\n", countXX("abcxx"));
    System.out.printf("Test #2 - countXX('xxx')\nOutput:%s\n", countXX("xxx"));
    System.out.printf("Test #3 - countXX('xxxx')\nOutput:%s\n", countXX("xxxx"));
  }
  
  public static int countXX(String input) 
  {
    int count = 0;

    for (int i = 0; i < input.length() - 1; i++) 
    {
      if (input.substring(i, i+2).equals("xx")) 
      {
        count++;
      }
    }

    return count;
  }
}
