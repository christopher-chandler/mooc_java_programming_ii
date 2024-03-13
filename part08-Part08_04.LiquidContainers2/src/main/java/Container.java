public class Container {

    private int ContainerOne;
    private  int ContainerTwo;

    public  Container (){

    }

    public int contains(){
        return  ContainerOne;
    }


    public void add(int amount) {
        if (amount > 0) {

            if (ContainerOne + amount <= 100) {
                ContainerOne += amount;
            } else if (ContainerOne + amount > 100) {
                ContainerOne = 100;
            }
        }

    }

    public void remove(int amount) {
        if (ContainerTwo- amount > 0){
            ContainerTwo-=amount;
        }

        if (amount >= ContainerOne) {
            ContainerOne = 0;
        }

    }

    public void move (int amount ){
        if (ContainerOne > 0 && amount > 0) {

            if (ContainerTwo+amount <= 100) {

                if (ContainerOne < amount) {
                    ContainerTwo += ContainerOne;
                    ContainerOne = 0;

                } else {

                    ContainerOne -= amount;
                    ContainerTwo += amount;
                }
                if (ContainerOne < 0) {
                    ContainerOne = 0;
                }

            } else {
                ContainerTwo = 100;
            }

        }
    }


    public String toString() {

        String containerDescription = String.format("First: %d/100\nSecond: %d/100 ",
                ContainerOne, ContainerTwo);
        return containerDescription ;
    }
}
