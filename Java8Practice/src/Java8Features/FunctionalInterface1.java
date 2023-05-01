package Java8Features;

//@FunctionalInterface 
public interface FunctionalInterface1{  
	
	/* constructor not allowed in interfaces
	 * FunctionalInterface() {
	 * 
	 * }
	 */
	
	  // abstract method
    void say(String msg);   
    
    // It can contain any number of Object class methods.   
    String toString();  
    
   //static method
    public static void msg()
    {
    	System.out.println("HI");
    }
    
    //default method
   default void optionalMsg()
    {
	   System.out.println("Hello from Optional");
    }
}  
