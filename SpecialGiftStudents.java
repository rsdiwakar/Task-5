import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        // List of 10 students' names
        List<String> students = Arrays.asList(
                "Aishu", "Pooja", "Akash", "John", "Andrew",
                "Vicky", "Anand", "Sam", "Albert", "Paul"
        );

        // Use Stream API with lambda expression to filter students whose names start with "A"
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A")) // Lambda expression to filter names starting with "A"
                .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students who will receive special gifts: " + specialGiftStudents);
    }
}

