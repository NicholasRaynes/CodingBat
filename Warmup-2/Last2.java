public class Last2
{
    public static void main(String[] args)
    {
        // Testing
        System.out.printf("Test #1 - last2('hixxhi')\nOutput: %d\n", last2("hixxhi"));
        System.out.printf("Test #2 - last2('xaxxaxaxx')\nOutput: %d\n", last2("xaxxaxaxx"));
        System.out.printf("Test #3 - last2('axxxaaxx')\nOutput: %d\n", last2("axxxaaxx"));
    }
    
    public static int last2(String input) 
    {
        if (input.length() < 2) 
        {
            return 0;
        }
  
        String end = input.substring(input.length() - 2);
  
        int counter = 0;
  
        for (int i = 0; i < input.length() - 2; i++) 
        {
            String group = input.substring(i, i + 2);
        
            if (group.equals(end)) 
            {  
                counter++;
            }
        }

        return counter;
    }
}
