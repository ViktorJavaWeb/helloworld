import java.io.PrintStream;

/* * Created by ustenko on 10.08.16.*/


public class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", yourName, name);
    }
}