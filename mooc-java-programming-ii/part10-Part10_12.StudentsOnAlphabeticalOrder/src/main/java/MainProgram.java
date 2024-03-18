

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("Jukka");
        Student second = new Student("Jaana");
        System.out.println(first.compareTo(second));
    }
}
