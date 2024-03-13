public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory ch = new ChangeHistory();


    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.setBalance(initialBalance);

        ch.add(initialBalance);

    }

    public void addToWarehouse(double amount)
    {
        System.out.println( );
        setBalance(getBalance()+amount);
        ch.add(amount+ch.showHistory().get(ch.showHistory().size()-1));
    }

    public double takeFromWarehouse(double amount) {

        if(amount > super.getBalance()){

            return super.getBalance();

        } else {
            ch.add(super.getBalance() - amount);
           return super.setBalance(super.getBalance() - amount);
        }

    }
    public String history(){

        return ch.showHistory().toString();
    }

    public void printAnalysis(){

        String msg = String.format("Product:%s \nHistory:%s  \nLargest amount of product:%s \nSmallest amount of product: %s\nAverage: %s",super.getName( ), ch.showHistory(),ch.maxValue(), ch.minValue(),ch.average());
        System.out.println(msg);
    }

    public String toString() {


        return  super.getName()+" balance "+super.getCapacity()+" Capacity "+super.getBalance();
    }
}
