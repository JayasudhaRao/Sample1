package ObjectEqualsCompareTest;

public class ObjectEqualsTest1 {

	public static void main(String ar[]) {
		Car c1 = new Car("Marcus", "Silver");
		Car c2 = new Car("Marcus", "Silver");

		if (c1 == c1)
			System.out.println("c1==c1 is true");

		if (c1 == c2)
			System.out.println("c1==c2 is true");

		if (c1.equals(c1))
			System.out.println("c1.equals(c1) is true");

		if (c1.equals(c2)) //true if we override equals()
			System.out.println("c1.equals(c2) is true");

		String a = "Hi";
		String b = "Hi";
		String c = "H";
		
		c = c+"i";

		if (a == a)
			System.out.println("a==a is true");

		if (a == b)
			System.out.println("a==b is true");

		if (a.equals(a))
			System.out.println("a.equals(a) is true");

		if (a.equals(b))
			System.out.println("a.equals(b) is true");

		if (a == c)
			System.out.println("a==c is true");

		if (a.equals(c))
			System.out.println("a.equals(c) is true");
		
		 c1=c2;

		 if (c1 == c2)
				System.out.println("c1==c2 is true");

			if (c1.equals(c2))
				System.out.println("c1.equals(c2) is true");

		/*c1==c1 is true
				c1.equals(c1) is true
				a==a is true
				a==b is true
				a.equals(a) is true
				a.equals(b) is true
				a.equals(c) is true
				c1==c2 is true
				c1.equals(c2) is true
		 */

	}
	
}
