import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> amounts = new HashMap<>();

    public void setSum(String person, double v) {

        amounts.put(person, v);

    }

    public double howMuchDoIOweTo(String person) {

        if (amounts.containsKey(person)){
        return amounts.get(person);}
        else {
            return  0;
        }
    }
}
