import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity;
    private ArrayList<Item> addedList = new ArrayList<>();

    public OneItemBox( ) {



    }


    @Override
    public void add(Item item) {

            if (addedList.size() < 1) {
                addedList.add(item);
            }


    }

    @Override
    public boolean isInBox(Item name) {


        return addedList.contains(name);
    }
}
