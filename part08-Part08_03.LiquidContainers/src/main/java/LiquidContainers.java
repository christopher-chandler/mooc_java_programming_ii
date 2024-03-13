
import java.util.Scanner;

public class LiquidContainers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ContainerOne = 0;
        int ContainerTwo = 0;

        while (true) {
            String First = String.format("First: %d/100", ContainerOne);
            String Two = String.format("Second: %d/100", ContainerTwo);
            System.out.println(First);
            System.out.println(Two);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (parts.length == 2) {

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add")) {

                    if (amount > 0) {

                        if (ContainerOne + amount <= 100) {
                            ContainerOne += amount;
                        } else if (ContainerOne + amount > 100) {
                            ContainerOne = 100;
                        }
                    }

                }

                if (command.equals("move")) {

                    if (ContainerOne > 0 && amount > 0) {

                        if (ContainerTwo+amount <= 100) {

                            if (ContainerOne < amount) {
                                ContainerTwo += ContainerOne;
                                ContainerOne = 0;

                            } else {

                                ContainerOne -= amount;
                                ContainerTwo += amount;
                            }
                            if (ContainerOne < 0) {
                                ContainerOne = 0;
                            }

                        } else {
                            ContainerTwo = 100;
                        }

                    }
                }

                if (command.equals("remove")){

                    if (ContainerTwo- amount > 0){
                    ContainerTwo-=amount;
                }
                }

            }


            if (input.equals("quit")) {
                break;
            }

        }
    }

}
