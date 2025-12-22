
public class Program {

    public static void main(String[] args) {
        Pipe<String> stringPipe = new Pipe<>();

        stringPipe.putIntoPipe("dibi");
        stringPipe.putIntoPipe("dab");
        stringPipe.putIntoPipe("dab");
        stringPipe.putIntoPipe("daa");

        while(stringPipe.isInPipe()) {
            System.out.println(stringPipe.takeFromPipe());
        }


        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());

    }





}
