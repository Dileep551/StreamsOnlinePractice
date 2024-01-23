import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesRemovalTest {

    @Test
    void removeDuplicates() {

        //Given
        List<String> givenNames = List.of("Dileep", "David", "Jared", "Dileep", "Ram", "David");

        //When
        List<String> expectedNames = DuplicatesRemoval.removeDuplicates(givenNames);
        List<String> actualNames = List.of("Dileep", "David", "Jared", "Ram");

        //Then
        assertEquals(actualNames, expectedNames);
        assertNotEquals(givenNames, expectedNames);

    }
}