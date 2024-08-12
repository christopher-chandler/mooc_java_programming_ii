
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        // We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (Integer.parseInt(row) <0) {
                break;
            }

            inputs.add(Integer.valueOf(row));
        }

        for (int i: inputs){

            if (i > 0 && i <6){
                System.out.println(i);
            }

        }
    }
}
