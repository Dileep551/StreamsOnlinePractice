

//Write a Java program to find the second smallest and largest elements in a list of integers using streams.

import java.util.List;

public class SmallestLargestNumber {

    public static Integer getLargestElement(List<Integer> numbers){


//        return numbers.stream()
//                .max(Integer::compareTo)
//                .get();


            return numbers.stream()
                    .sorted()
                    .toList()
                    .get(numbers.size() -1);


    }

    public static Integer getSecondLargestElement(List<Integer> numbers){


        return numbers.stream()
                .sorted()
                .toList()
                .get(numbers.size() - 2);



    }




}
