import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abs = new HashMap<>();

    public Abbreviations() {

    }


    public void addAbbreviation(String s, String for_example) {

        abs.put(s,for_example);

    }

    public boolean hasAbbreviation(String part) {

        return abs.containsKey(part);
    }

    public String findExplanationFor(String part) {


        return abs.get(part);
    }
}
