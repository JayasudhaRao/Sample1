package StringBufferBuilder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_Buffer_Bulder_Final {
	
	private final int i;// = 10;
//i = 12;
	String_Buffer_Bulder_Final()
	{
		i=12;
	}

//i=12;
	public static void main(String args[])
	{
		
		//i=12;
		//System.out.println("final int value is "+ i);
				
		char[] a = {'j','a',' ', 'y'};
		String str = String.valueOf(a).replaceAll("\\s", "");
     System.out.println("String value is "+ str);
     
      str = str.replaceAll("\\s", "");
     System.out.println("String value after replaceAll is "+ str);
     
    //different ways to convert char array to string 
   // String str1 = str1.toString(a);
    String str2 = new String(a);
    String str3 = String.copyValueOf(a);
    String str4 = Stream.of(a)
             .map(String::new)
             //map(a1 -> new String(a1))
             .collect(Collectors.joining()); 
    System.out.println("String value is "+ str2);
    System.out.println("String value is "+ str3);
    System.out.println("String value is "+ str4);

     StringBuffer sbf = new StringBuffer("j");
     sbf.append('a');
     sbf.append(' ');
     sbf.append('y');
     System.out.println("StringBuffer value is "+ sbf);
     
     StringBuilder sbl = new StringBuilder("j");
     sbl.append('a');
     sbl.append(' ');
     sbl.append('y');
     System.out.println("StringBuilder value is "+ sbl);
     
    
     String text = """
     		{
     		"name" : "John Doe",
     		"age" : "45"
     		}
     		""";
     System.out.println("Json string value is\n"+ text);
	}
}
