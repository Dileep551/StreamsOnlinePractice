import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortStringsTest {

    @Test
    void getStringSortedAscending() {

        //Given
        List<String> givenNames = List.of("Dileep", "David", "Jared", "Veronica");

        //When
        List<String> actualSortedNames = List.of("David", "Dileep", "Jared", "Veronica");

        //Then
        assertEquals(SortStrings.getStringSortedAscending(givenNames), actualSortedNames);

    }

    @Test
    void getStringSortedDescending() {

        //Given
        List<String> givenNames = List.of("Dileep", "David", "Jared", "Veronica");

        //When
        List<String> actualSortedNames = List.of("Veronica", "Jared", "Dileep", "David");

        //Then
        assertEquals(SortStrings.getStringSortedDescending(givenNames), actualSortedNames);


    }
}