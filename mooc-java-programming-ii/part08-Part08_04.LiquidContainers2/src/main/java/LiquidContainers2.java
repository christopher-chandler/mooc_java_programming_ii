
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container liquidContainer = new Container();
        Container container = new Container();
        System.out.println(container);
        while (true) {
            System.out.println(liquidContainer);
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (parts.length == 2) {

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    liquidContainer.add(amount);

                }

                if (command.equals("move")) {
                    liquidContainer.move(amount);
                }

                if (command.equals("remove")){
                    liquidContainer.remove(amount);
                }

            }

            if (input.equals("quit")) {
                break;
            }

        }
    }

}
