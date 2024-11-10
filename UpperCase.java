import java.util.*;
import java.util.stream.*;

public class UpperCase {
    public static void main(String[] args) {
        // Create a Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert the Stream to a List of Strings in uppercase using map
        List<String> upperCaseNames = names
                .map(String::toUpperCase)  // Apply the toUpperCase transformation
                .collect(Collectors.toList());  // Collect the results into a List

        // Print the converted list
        System.out.println("List in Uppercase: " + upperCaseNames);
    }
}
