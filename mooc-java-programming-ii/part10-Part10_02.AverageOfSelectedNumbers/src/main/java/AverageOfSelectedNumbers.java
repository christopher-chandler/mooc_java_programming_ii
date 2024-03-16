
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void determineIfPositiveOrNegative(String number){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            determineIfPositiveOrNegative(row);
            inputs.add(row);
        }


// working out the average
        double positive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s)).filter(number -> number >= 0 )
                .average()
                .getAsDouble();

        double negative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0 )
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String row = scanner.nextLine();

        if (row.equals("n")){

            Locale.setDefault(Locale.US);

            System.out.println(String.format("Average of the negative numbers: %.2f", negative ));
        } else {
            System.out.println(String.format("Average of the positive numbers: %.2f",  positive));

        }





    }
}
