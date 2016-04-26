import people.Employee;
import people.Student;

import java.lang.reflect.Array;
import java.util.*;

public class Startup {
  public static void main(String[] args) {

    List<String> list = new ArrayList();

    list.add("zzzobject 11");
    list.add("qqqobject 2");
    list.add("yyobject 3");
    list.add("aaaaobject 4");

    //System.out.println(list.get(1));

    //System.out.println("broi : "+list.size());
    //list.remove(1);

    Collections.sort(list);

    list.forEach(System.out::println);
    //System.out.println("broi : "+list.size());
    //System.out.println(list.get(1));


    Student stamat = new Student("Stamat", "IT Academy", Student.mySchool.Test2);

    System.out.println(stamat.toString());


    Object obj = new Object();
    Employee emp = new Employee("Ime", 32, "Academy", 800.0);

  }
}