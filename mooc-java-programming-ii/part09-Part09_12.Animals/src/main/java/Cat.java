public class Cat extends Animal implements NoiseCapable {

    private String name;
    public Cat() {
        super("Cat");
    }

    public Cat(String name) {

        super( name);
    }

    public void purr(){

        System.out.println("Cat purrs");
    }


    @Override
    public void makeNoise() {
        purr();
    }
}
