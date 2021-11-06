package epam_questions.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

  private static final String DIVIDER = "=================================================================";

  public static void main(String[] args) {

    //Difference between 'add' and 'set' methods
    List<String> list = new ArrayList<>(Arrays.asList("Olya", "Tayson", "Kira", "Anatoliy", "Malvina Karlovna"));
    list.add(1, "Kuzya");
    list.forEach(System.out::println);
    System.out.println(DIVIDER);
    list.set(1, "Valera");
    list.forEach(System.out::println);

    //Sorting
    //First way
    list.sort((el1, el2) -> el2.compareTo(el1));
    System.out.println(DIVIDER + "\nSorting 1:\n" + DIVIDER);
    list.forEach(System.out::println);
    //Second way
    Collections.sort(list);
    System.out.println(DIVIDER+ "\nSorting 2:\n" + DIVIDER);
    list.forEach(System.out::println);
    //Third way
    System.out.println(DIVIDER+ "\nSorting 3:\n" + DIVIDER);
    list.stream()
        .sorted((element1, element2) -> element2.length() - element1.length())
        .forEach(System.out::println);

  }

}
