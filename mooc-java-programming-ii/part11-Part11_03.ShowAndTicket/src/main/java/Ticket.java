import java.util.ArrayList;

public class Ticket {

    private int seat;
    private int code;
    private Show show;

    public Ticket (int seat, int code){
        this.seat = seat;
        this.code = code;

    }


    public String getTime(){
        return show.getTime();
    }

    public String getMovie(){
        return show.getMovie();
    }
}
