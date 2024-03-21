package Java17Features;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayPeriodSupport {

public static void main(String ar[])
{
	//printing day period in English
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B");
	
	System.out.println(dtf.format(LocalTime.of(8,0)));
	System.out.println(dtf.format(LocalTime.of(13,0)));
	System.out.println(dtf.format(LocalTime.of(20,0)));
	System.out.println(dtf.format(LocalTime.of(23,0)));
	System.out.println(dtf.format(LocalTime.of(0,0)));
	
	
	//printing day period in Dutch
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("B").withLocale(Locale.forLanguageTag("NL"));
		
		System.out.println(dtf1.format(LocalTime.of(8,0)));
		System.out.println(dtf1.format(LocalTime.of(13,0)));
		System.out.println(dtf1.format(LocalTime.of(20,0)));
		System.out.println(dtf1.format(LocalTime.of(23,0)));
		System.out.println(dtf1.format(LocalTime.of(0,0)));
	
}

}
