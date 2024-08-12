import java.util.ArrayList;

public class Herd implements Movable {


    private ArrayList<Movable> herdList = new ArrayList<>();


    public Herd( ) {

    }

    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable herd: herdList){
            herd.move(dx,dy);
        }

    }


    public String toString() {

        String msg = "";

        for (Movable herd: herdList){

            msg = msg + herd + " \n";
        }

        return msg;
    }



}
