package Java8MethodRef;

import java.util.*;
import java.util.function.*;


public class MetodRef {

 // Get List of objects of given
 // length and Supplier
 public static <T> List<T>
 getObjectList(int length,
               Supplier<T> objectSupply)
 {
     List<T> list = new ArrayList<>();
//objectSupply.get() returns Person object for every loop
     for (int i = 0; i < length; i++)
         list.add(objectSupply.get());
     return list;
 }

 public static void main(String[] args)
 {

     // Get 5 persons by supplying
     // person supplier, Supplier is
     // created by person constructor
     // reference
     List<Person> personList
         = getObjectList(5, Person::new);

     // Print names of personList
     personList.stream()
         .map(x -> x.getName())
         .forEach(System.out::println);
     
     
 }
}
