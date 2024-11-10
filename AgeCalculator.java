import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for birthdate input
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Convert the input string to a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and current date
        Period period = Period.between(birthdate, currentDate);

        // Output the calculated age in years, months, and days
        System.out.println("Your age is: " + period.getYears() + " years, "
                + period.getMonths() + " months, and "
                + period.getDays() + " days.");
    }
}
