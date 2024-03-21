package Java17Features;

import java.awt.Color;

public class RecordsImmutableClasses {

	public static void mian(String ar[])
	{
		//creates immutable class GrapeRecord with color, pits fields, no need to write getters and setters
		record GrapeRecord(Color color, int pits) { }
		
		GrapeRecord gr = new GrapeRecord(Color.BLUE, 1);
		
			System.out.println("Grape is "+ gr);
			System.out.println("Grape color is "+ gr.color());
			System.out.println("Grape pits are "+ gr.pits());
		
	}
}
