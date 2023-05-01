package Java8Features;

public class UserSuperEx extends SuperEx{
	
	String str1 = super.str;
	
	String str2 = "sudha";
	
	void displayMsg1()
	{
		super.displayMsg();
		super.displayMsg11();
		System.out.println("In child class ");
	}
	
	static void displayMsg2()
	{
		//super keyword not used in static methods
		//super.displayMsg();
		//super.displayMsg11();
		//this keyword not used in static methods
		//this.displayMsg1();
		System.out.println("In child class ");
	}
	
	void displayMsg3()
	{
		this.displayMsg2();
		UserSuperEx.displayMsg2();
		System.out.println("In child class method 3 ");
	}
	
public static void main(String args[])
{
	UserSuperEx u = new UserSuperEx();
	u.displayMsg3();
}
}
