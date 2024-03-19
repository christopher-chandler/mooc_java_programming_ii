import java.util.Locale;

public class AdultLiteracyRate implements Comparable <AdultLiteracyRate> {

    private String gender;
    private String country;
    private int year;
    private double percentage;

    public AdultLiteracyRate(String gender, String country, int year, double percentage ){
        this.gender = gender.replace(" (%)","");
        this.country = country;
        this.year = year;
        this.percentage = percentage;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.US);
        return this.country+" ("+this.year+"),"+this.gender+", "+this.percentage;
    }

    @Override
    public int compareTo(AdultLiteracyRate o) {

            if (this.percentage == o.getPercentage()) {
                return 0;
            } else if (this.percentage > o.getPercentage()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

