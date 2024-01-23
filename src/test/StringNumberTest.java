import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringNumberTest {

    @Test
    void getStringCount() {

        //Give
        List<String> names = List.of("Dileep", "David", "Jared", "Veronica", "Ram", "Dileep");

        //When
        String countChar_D = "D";
        String countChar_J = "j";

        //Then
        assertEquals(StringNumber.getStringCount(names,countChar_D), 3);
        assertNotEquals(StringNumber.getStringCount(names,countChar_J), 1);

    }
}