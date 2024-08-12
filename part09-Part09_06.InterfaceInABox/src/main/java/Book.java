import java.util.Locale;

public class Book implements Packable {

    private String author;
    private String nameOfBook;
    private double weight;

    public Book(String author, String nameOfBook, double weight) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString(){
        Locale.setDefault(Locale.US);

        String info = String.format("%s: %s",this.author, this.nameOfBook );
        return info;

    }

}
