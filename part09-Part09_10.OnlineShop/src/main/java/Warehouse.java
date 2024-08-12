import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouseProducts = new HashMap<>();
    private Map<String, Integer> stockBalance = new HashMap<>();

    public void addProduct(String product, int price, int stock) {

        warehouseProducts.put(product, price);
        stockBalance.put(product, stock);
    }

    public int price(String product) {

        return warehouseProducts.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stockBalance.getOrDefault(product, 0);
        }

    public boolean take(String product) {

       int balance = stockBalance.getOrDefault(product, 0);

       int newBalance = balance-1;

       if (newBalance >= 0) {
           stockBalance.put(product,newBalance);
           return true;

       } else {
           return false;
       }




    }

    public Set<String> products(){


        return warehouseProducts.keySet();

    }
}
