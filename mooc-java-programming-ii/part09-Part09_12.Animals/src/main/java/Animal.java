public abstract class Animal {

    private String name;

    public Animal(String name){

        this.name = name;
    }

    public void eat(){
        System.out.println(String.format("%s eats",this.name));

    }
    public void sleep(){

        System.out.println(String.format("%s sleeps",this.name));
    }
    public String getName(){
        return this.name;
    }
}
