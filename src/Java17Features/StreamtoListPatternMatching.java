package Java17Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoListPatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<String> str = Stream.of("j", " ", "y"); 
//List<String> strL = str.collect(Collectors.toList());

//java 17 supports stream.toList() directly
List<String> strL = str.toList();

for(String s: strL)
{
System.out.println(s);	
}

//pattern matching of instanceof()
Object o = new StreamtoListPatternMatching();

if(o instanceof StreamtoListPatternMatching)
{
	StreamtoListPatternMatching sp = (StreamtoListPatternMatching)o;
	System.out.println("This is instance of class " + sp.getClass());
}
//in java 17, it can be rewritten as

if(o instanceof StreamtoListPatternMatching sp)
{
	System.out.println("This is instance of class " + sp.getClass());
}
	}

}
