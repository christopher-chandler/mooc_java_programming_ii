package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null){
            throw new IllegalArgumentException("name cannot be null");
        }

        if (name.length() > 40  ||   name.isEmpty()){
            throw new IllegalArgumentException("the name given as the parameter should not be null,\n" +
                    "        empty, or over 40 characters in length.");
        }

        this.name = name;

        /*
        The constructor of the class Person should ensure that the name given as the parameter is not null,
        empty, or over 40 characters in length.

        The age should between 0 and 120.
        If some of these conditions are not met, the constructor should throw an IllegalArgumentException.
         */
        if (age  >= 0  &&  age <= 120){
            this.age = age;
        } else{
            throw new IllegalArgumentException("The age should between 0 and 120.");
        }


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
