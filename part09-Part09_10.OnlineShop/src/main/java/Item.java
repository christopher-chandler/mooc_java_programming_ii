
public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    public int price() {
        return this.unitPrice*this.qty;
    }

    public void increaseQuantity() {
        qty++;
    }

    public String toString(){

        return String.format("%s: %d",this.product, this.qty);
    }
}
