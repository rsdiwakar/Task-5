import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        // Initialize the List with strings
        List<String> listStrings = Arrays.asList("ab", "", "bc", "efg", "abed", "", "jkl");

        // Filter out the empty strings and collect the non-empty strings into a new list
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty())  // Check if string is not empty
                .collect(Collectors.toList());

        // Print the non-empty strings
        System.out.println("List of non-empty strings: " + nonEmptyStrings);
    }
}
