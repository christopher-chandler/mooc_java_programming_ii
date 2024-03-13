
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public boolean equals(Object obj) {

        SimpleDate SimpleDateObject = (SimpleDate) obj;

        // Identical objects
        if (earlier(SimpleDateObject)) {
            return obj.equals(this);
        }

        int yearRemoved = 0;

        if (SimpleDateObject.year != this.year){
            return false;
        }

        if (SimpleDateObject.month != this.month){
            return false;
        }

        if (SimpleDateObject.day != this.day){
            return false;
        }

        if (SimpleDateObject.month != this.month){
            return false;
        }

        else{
            return true;
        }
    }

}
