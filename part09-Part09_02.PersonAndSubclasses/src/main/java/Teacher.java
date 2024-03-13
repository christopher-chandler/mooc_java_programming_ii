public class Teacher extends Person {

    private int Salary;
    public Teacher(String name, String address, int Salary) {
        super(name, address);
        this.Salary = Salary;
    }

    @Override
    public String toString() {

        String msg = String.format(
                "%s \n  %s\n  salary %s euro/month", super.returnName(), super.returnAddress(), this.Salary
        );

        return msg;
    }


}
