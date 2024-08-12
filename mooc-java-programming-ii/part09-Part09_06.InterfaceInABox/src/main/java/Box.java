import java.util.ArrayList;
import java.util.Locale;

public class Box implements Packable{

    private double maximumCapacity;
    private ArrayList<Packable> packable;
    private double sum;


    public Box(double maximumCapacity ) {
            this.maximumCapacity = maximumCapacity;
            this.packable = new ArrayList<>();
            this.sum = 0;

    }


    @Override
    public double weight() {
        double sum = 0;
        double weight = 0;

        for (Packable w: packable) {
            sum = sum+w.weight();
        }

        return sum;
    }

    public void add(Packable item) {

        double tempWeight =  sum + item.weight();
        if (tempWeight < this.maximumCapacity) {

            packable.add(item);
            sum += item.weight();
        }

    }

    @Override
    public String   toString(){
        Locale.setDefault(Locale.US);
        int itemsInBox = this.packable.size();


        return String.format("Box: %d items, total weight %.1f kg", itemsInBox, this.weight());
    }

}
