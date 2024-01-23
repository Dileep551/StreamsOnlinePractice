import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmallestLargestNumberTest {

    @Test
    void getSecondSmallestLargestElement() {

        //Given
        List<Integer> givenNumbers = List.of(12, 24, 51, 9999, 3, 89, 22);

        //When
        int largestNumber = 9999;

        //Then
        assertEquals(SmallestLargestNumber.getLargestElement(givenNumbers), largestNumber);


    }

    @Test
    void getSecondLargestElement() {

        //Given
        List<Integer> givenNumbers = List.of(12, 24, 51, 9999, 3, 89, 22);

        //When
        int largestNumber = 89;

        //Then
        assertEquals(SmallestLargestNumber.getSecondLargestElement(givenNumbers), largestNumber);


    }
}