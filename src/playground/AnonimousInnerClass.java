package playground;

import java.util.Arrays;
import java.util.Comparator;

public class AnonimousInnerClass {

  public static void main(String[] args) {
    Person[] people = new Person[22];
    Arrays.sort(people, new Comparator<Person>() {
      public int compare(Person p1, Person p2) {
        return p1.name.length() - p2.name.length();
      }
    });

    Arrays.sort(people, Comparator.comparing((Person p) -> p.name));
  }
}

class Person {

  String name;
}