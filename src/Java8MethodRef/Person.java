package Java8MethodRef;
//Java Program to Illustrate How We can Use
//constructor method reference

//Importing required classes
import java.util.*;

//Object need to be sorted
class Person {
private String name;
private Integer age;

// Constructor
public Person()
{
   Random ran = new Random();

   // Assigning a random value
   // to name
   this.name
       = ran
             .ints(97, 122 + 1)
             .limit(7)
             .collect(StringBuilder::new,
                      StringBuilder::appendCodePoint,
                      StringBuilder::append)
             .toString();
}

public Integer getAge()
{
   return age;
}
public String getName()
{
   return name;
}
}
