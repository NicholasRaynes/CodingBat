public class Last2
{
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
