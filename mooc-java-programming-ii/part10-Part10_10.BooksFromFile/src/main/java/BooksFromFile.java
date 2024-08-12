
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static List<Book> readBooks(String file) {

        List<Book> bookList = new ArrayList<>();
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get(file))
                    // splitting the row into parts on the "," character
                    .map(row -> row.split(","))
                    // creating persons from the parts
                    .map(row -> new Book(row[0],Integer.valueOf(row[1]),Integer.valueOf(row[2]),row[3]))
                    // and finally add the persons to the list
                    .forEach(book -> bookList.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return bookList;
    }
    public static void main(String[] args) {

        System.out.println(readBooks("src/main/java/file.txt").toString());


    }

}
