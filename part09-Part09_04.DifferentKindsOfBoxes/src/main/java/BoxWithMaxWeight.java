import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> addedList = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {

        this.capacity = capacity;

    }

    private int itemSumCapacity(){
        int sum = 0;

        for (Item i : addedList){
            sum= sum + i.getWeight();
        }

        return sum;

    }

    @Override
    public void add(Item item) {

        if (itemSumCapacity()+item.getWeight() <= capacity){
        addedList.add(item);
        }

    }


    public boolean isInBox(Item name) {


        return addedList.contains(name);
    }
}
