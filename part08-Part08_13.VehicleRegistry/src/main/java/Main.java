

public class Main {

    public static void main(String[] args) {


        VehicleRegistry vr = new VehicleRegistry();
        String res = vr.search(new LicensePlate("FI", "AAA-111"));
        System.out.println(res);

    }
}
