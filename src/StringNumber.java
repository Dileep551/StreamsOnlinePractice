
//Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.List;


public class StringNumber {

    public static long getStringCount(List<String> names, String character){

        return names.stream()
                .filter(s->s.startsWith(character))
                .count();



    }

}
