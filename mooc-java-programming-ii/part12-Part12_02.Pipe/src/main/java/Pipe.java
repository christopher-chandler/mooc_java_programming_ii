import java.util.ArrayList;

public class Pipe <T> {

    public ArrayList<T> pipeLine = new ArrayList<>();

    public void putIntoPipe(T Value) {
        pipeLine.add(Value);
    }

    public T takeFromPipe(){

        if (!pipeLine.isEmpty()){

        T value = pipeLine.get(0);
        pipeLine.remove(0);
        return value;}
        else {
            return null;
        }
    }

    public boolean isInPipe(){

        return !pipeLine.isEmpty();
    }

}
