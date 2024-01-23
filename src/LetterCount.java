import java.util.Arrays;
import java.util.List;

public class LetterCount {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

        List<String> listNames = List.of(names);

//        return Arrays.stream(names).sequential()
//                .filter(s->s.length() > 5)
//                .mapToInt(String::length)
//                .sum();

        return listNames.stream()
                .filter(s->s.length() > 5)
                .mapToInt(String::length)
                .sum();


    }

    
}
