import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
            this.employees = new ArrayList<>();
            }

    public void add(Person personToAdd) {
            this.employees.add(personToAdd);
            }

    public void add(List<Person> peopleToAdd) {
            employees.addAll(peopleToAdd);
            }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }


            }

    public void print(Education education) {

        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)){
                System.out.println(nextInLine);
            }
        }



  }
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().getEducation()==education) {
                iterator.remove();

            }
    } }
}
