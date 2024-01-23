

//Write a Java program to remove all duplicate elements from a list using streams.

import java.util.List;

public class DuplicatesRemoval {

    public static List<String> removeDuplicates(List<String> names){

        return names.stream()
                .distinct()
                .toList();


    }



}
