package Java17Features;

public class Switch_Yield {

	public static void main(String args[])
	{
		//switch returning value using yield
		System.out.println(switch("apple") {
		case "apple", "pear":
			yield "Common Fruit";
		default:
			yield "Undefined fruit";
		});
	
	//Using ->  yield and multiple lines in case
	String text = switch("avocado") {
	case "apple", "pear" ->
	{
		System.out.println("Given fruit is");
		yield "Common Fruit";
		}
	case "orange" -> "Sour fruit";
	default-> "Undefined fruit";
	};
	System.out.println("Fruit type is "+text);
 }
}
