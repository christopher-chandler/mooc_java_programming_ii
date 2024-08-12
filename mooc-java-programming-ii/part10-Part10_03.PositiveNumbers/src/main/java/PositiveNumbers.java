


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers) {

        List<Integer> positive = new ArrayList<>();


        for (Integer i: numbers){

            if (i >= 0){
                positive.add(i);
            }
        }
        return positive;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }


            list.add(Integer.valueOf(row));
        }


        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .collect(Collectors.toCollection(ArrayList::new));

        positive(values);

    }

}
