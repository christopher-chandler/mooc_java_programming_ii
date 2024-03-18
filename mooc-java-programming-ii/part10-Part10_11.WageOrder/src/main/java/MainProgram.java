
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Human first = new Human("a", 0);
        Human second = new Human("b", 2147483647);
        System.out.println(first.compareTo(second));

    }
}
