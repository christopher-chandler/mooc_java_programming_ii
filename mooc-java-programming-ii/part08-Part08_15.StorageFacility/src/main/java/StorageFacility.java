import java.util.* ;

public class StorageFacility {

    HashMap<String, ArrayList<String>> storageContainer = new HashMap<>();


    public void add(String unit, String item) {

        if (!storageContainer.containsKey(unit)) {
            storageContainer.put(unit, new ArrayList<>());
        }


            storageContainer.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {

        if (storageContainer.containsKey(storageUnit)) {
            return storageContainer.get(storageUnit);

        } else {
            return new ArrayList<String>();
        }

    }

    public void remove(String storageUnit, String item) {

       storageContainer.get(storageUnit).remove(item);

       int storageSize = storageContainer.get(storageUnit).size();

       if (storageSize == 0) {
           storageContainer.remove(storageUnit);
       }


    }

    public ArrayList<String>  storageUnits() {

        ArrayList<String> storageUnitNames = new ArrayList<String>();
        storageUnitNames.addAll(storageContainer.keySet());

        return storageUnitNames;

    }
}
