import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history = new ArrayList<>();


    public void add (double status){
        history.add(status);

    }

    public void clear(){
        history = new ArrayList<>();
    }


    public ArrayList<Double> showHistory(){
        return history;
    }

    public double maxValue() {

        return Collections.max(history);
    }

    public double minValue() {

        return Collections.min(history);
    }


    public double average() {
        double sum = 0;
        for(Double d : history)
            sum += d;
        return sum/history.size();
    }

    public String toString(){

        return history.toString();
    }
}
