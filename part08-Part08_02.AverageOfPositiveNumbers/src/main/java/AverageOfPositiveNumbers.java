
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        double score = 0;
        int numberAmounts = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());


            if (number > 0 && number <=100) {
                score+=number;
                numberAmounts++;
            }

            if (number == 0){
                if (score == 0) {
                    System.out.println("Cannot calculate the average.");
                }
                break;
            }

        }
        System.out.println(score/numberAmounts);


    }
}
