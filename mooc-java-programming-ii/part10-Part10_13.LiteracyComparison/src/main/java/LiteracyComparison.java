
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        List<AdultLiteracyRate> literacyData = new ArrayList<>();
        try {

            Files.lines(Paths.get("literacy.csv"))

                    .map(row -> row.split(","))


                    .forEach(row ->literacyData.add(
                            new AdultLiteracyRate(row[2],row[3],Integer.parseInt(row[4]),Double.parseDouble(row[5]))
                    ));
         List  result =  literacyData.stream()
                    .sorted((o1, o2) -> Double.compare(o1.getPercentage(), o2.getPercentage()))
                    .collect(Collectors.toList());

         result.stream().limit(5).forEach(c -> System.out.println(c));


        } catch (Exception e) {


        }


    }
}
