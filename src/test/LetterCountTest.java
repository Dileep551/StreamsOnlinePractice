import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountTest {

    @Test
    public void test() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
    }
}