public class Dog extends Animal implements NoiseCapable {

    private String name;
    public Dog() {
        super("dog");
    }

    public Dog(String name) {

        super( name);
    }

    public void bark(){

        System.out.println("Dog barks");
    }


    @Override
    public void makeNoise() {
        bark();
    }
}
