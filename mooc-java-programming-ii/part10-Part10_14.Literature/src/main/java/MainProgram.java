
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        String nameOfBookText = "Input the name of the book, empty stops:";
        String ageOfRecommendationText = "Input the age recommendation:";

        while (true) {
            System.out.print(nameOfBookText);
            String name = scanner.nextLine();

            if (name.equals("")   ) {
                break;
            }

            System.out.print(ageOfRecommendationText);
            String age = scanner.nextLine();

            bookList.add( new Book(name, Integer.valueOf(age)));

        }
        System.out.println();
        String msg = String.format("%d books in total.",bookList.size());
        System.out.println(msg);
        System.out.println();

        System.out.println("Books:");

        //bookList.stream().forEach(book -> System.out.println(book));
        List<Book> result = bookList.stream()
                .sorted(Comparator.comparingInt(Book::getAgeRecommendation)
                        .thenComparing(Book::getName))
                .collect(Collectors.toList());




        result.stream().forEach(c -> System.out.println(c));
    }

}

