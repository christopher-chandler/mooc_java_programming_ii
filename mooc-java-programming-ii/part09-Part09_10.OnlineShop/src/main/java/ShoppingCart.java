import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {


    private Map<String, Item> cart = new HashMap<>();

    public void add(String product, int price){

       Item newItem = new Item(product, 1, price);

       if (cart.containsKey(product)){
           cart.get(product).increaseQuantity();

       } else {

       cart.put(product, newItem);
    }
    }


    public int price() {

        int totalPrice = 0;

        for (Map.Entry<String, Item> p : cart.entrySet()){


            totalPrice = totalPrice+p.getValue().price();
        }



        return totalPrice;
    }

    public void print(){

        for (Map.Entry<String, Item> p : cart.entrySet()){


            System.out.println(p.getValue());
        }
    }

}
