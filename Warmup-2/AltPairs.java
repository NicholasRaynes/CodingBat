public class AltPairs
{
  public static void main(String[] args)
  {
    // Testing
    System.out.printf("Test #1 - altPairs('kitten')\nOutput:%s\n", altPairs("kitten"));
    System.out.printf("Test #2 - altPairs('Chocolate')\nOutput:%s\n", altPairs("Chocolate"));
    System.out.printf("Test #3 - altPairs('CodingHorror')\nOutput:%s\n", altPairs("CodingHorror"));
  }
  public String altPairs(String str) 
  {
    String output = "";
  
    for (int i=0; i<str.length(); i += 4) 
    {
      int end = i + 2;
    
    if (end > str.length()) 
    {
      end = str.length();
    }
    
    output = output + str.substring(i, end);
    }
  
    return output;
  }
}
