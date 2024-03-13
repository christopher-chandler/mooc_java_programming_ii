

public class Main {

    public static void main(String[] args) {
        Box box = new OneItemBox();
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
        boolean b = box.isInBox(new Item("b"));

        System.out.println(b);

        /*
        Expected :true
        Actual   :false
         */
    }
}
