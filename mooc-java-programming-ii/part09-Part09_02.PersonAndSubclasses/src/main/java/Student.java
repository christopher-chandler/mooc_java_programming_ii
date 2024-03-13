public class Student extends Person{

    private int credit;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        credit++;
    }

    public int credits() {

        return credit;
    }
    @Override
    public String toString() {

        String msg = String.format(
                "%s \n  %s\n  Study credits %s", super.returnName(), super.returnAddress(), credit
        );


        return
             msg
                ;
    }
}
