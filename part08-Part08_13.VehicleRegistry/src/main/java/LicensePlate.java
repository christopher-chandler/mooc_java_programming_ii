
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode(){

        int hash = 15;
        int liNumberHash = this.liNumber.length()*hash;
        int countryHash = this.country.length()*hash;


        return liNumberHash*countryHash;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicensePlate)) return false;
        LicensePlate that = (LicensePlate) o;
        return liNumber.equals(that.liNumber) && country.equals(that.country);
    }
}
