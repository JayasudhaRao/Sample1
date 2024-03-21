package Java8Features;

//import Java8Features.FunctionalInterface; --no need, default access modifier accessible within same package

public class FunctionalInterfaceImpl //implements FunctionalInterface1
{  
	
	FunctionalInterfaceImpl()
	{
		//calls lang.object's default constructor
		super();
	}
    public void say(String msg){  
        System.out.println(msg);  
    } 
    
    //default keyword allowed only in interfaces so we can not override default methods of an interface but we can override with public keyword
 /*   public void optionalMsg()
    {
   //super(); --not allowed bcz interface doesnt allow constructors
    	System.out.println("Hello from Optional in subclass");
    }
    */
    //we can override static methods of an interface.
    public static void msg()
    {
    	//super(); --not allowed bcz interface doesnt allow constructors
    }
    public static void main(String[] args) {  
        FunctionalInterfaceImpl fie = new FunctionalInterfaceImpl();  
        fie.say("Hello there");  
        
        FunctionalInterface1.msg();
        //fie.optionalMsg();
        AccessibleClass a = new AccessibleClass();
        a.optionalMsg();
        //using lambda expression
    /*    ("Hi from lmbda expression")->{
        	system.outprintln()
        };*/
    }  
}  
