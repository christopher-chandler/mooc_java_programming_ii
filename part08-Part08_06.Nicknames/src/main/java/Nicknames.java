
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> Nicknames = new HashMap<>();

        Nicknames.put("mathew", "matt");
        Nicknames.put("michael", "mix");
        Nicknames.put("arthur", "artie");

        System.out.println(Nicknames.get("arthur"));


    }

}
