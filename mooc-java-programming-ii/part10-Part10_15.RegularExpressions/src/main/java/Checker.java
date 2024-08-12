

public class Checker {


    public boolean isDayOfWeek(String string) {


        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
        return true;
    } else {
        return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches("[aieou]*")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {


        String[] time = string.split(":");

        if (time.length != 3){
            return false;
        }

        String hour = time[0];
        String minute = time[1];
        String second = time[2];


        if (
                hour.matches("0[0-9]|1[0-9]|2[0-3]") // Matches hours from 00 to 23
                        && minute.matches("0[0-9]|[1-5][0-9]") // Matches minutes from 00 to 59
                        && second.matches("0[0-9]|[1-5][0-9]") // Matches seconds from 00 to 59
        )
        {

            return true;
        } else {
            return false;
        }

    }

}
