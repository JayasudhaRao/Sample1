package Java17Features;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingSupport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat nbf = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
		
		System.out.println(nbf.format(1000));
		System.out.println(nbf.format(100000));
		System.out.println(nbf.format(1000000));
		
		
NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
		
		System.out.println(nf.format(1000));
		System.out.println(nf.format(100000));
		System.out.println(nf.format(1000000));
	}

}
