import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {


    private HashMap<LicensePlate, String> VehicleOwners = new HashMap<>();


    public VehicleRegistry(){

    }


    public boolean add(LicensePlate licensePlate, String owner){

        if (VehicleOwners.get(licensePlate) == null){

            VehicleOwners.put(licensePlate,owner);

            return true;

        }
        else {

            return  false;
        }


    }


    public String get(LicensePlate licensePlate){

        return VehicleOwners.get(licensePlate);
    }


    public boolean remove(LicensePlate licensePlate) {

        if (VehicleOwners.remove(licensePlate) != null){
            return true;
        } else {
            return  false;
        }


    }

    public void printLicensePlates(){


        for (LicensePlate plate: this.VehicleOwners.keySet()){

            System.out.println(plate);

        }

    }

    public void printOwners() {

        ArrayList<String> AlreadyPrinted = new ArrayList<>();


        for (String owner: this.VehicleOwners.values()){


            if(!AlreadyPrinted.contains(owner)){
                System.out.println(owner);

            }
            AlreadyPrinted.add(owner);

        }
    }

    public String search(LicensePlate fi) {

        if (this.VehicleOwners.get(fi) == null){
            return null;
        } else {

            return this.VehicleOwners.get(fi);
        }

    }
}
