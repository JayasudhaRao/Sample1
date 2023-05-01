package ObjectEqualsCompareTest;

 public class Car {

	private String name;
	private String color;
	
	public Car()
	{
		
	}
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//overriding equals method to return true if 2 objects have same values
	@Override
	public boolean equals(Object obj) {
	      if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Car)) {
	         return false;
	      }
	      Car c = (Car) obj;
	      return name.equals(c.name)&& color.equals(c.color);
	   }
	
	@Override //not needed
	public int hashCode()
	{
		return 1;
	}
}
