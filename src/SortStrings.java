
// Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

import java.util.Comparator;
import java.util.List;


public class SortStrings {

    public static List<String> getStringSortedAscending(List<String> names){

        return names.stream()
                .sorted()
                .toList();

    }

    public static List<String> getStringSortedDescending(List<String> names){

        return names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();



    }

}
