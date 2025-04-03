package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> newSensors = new ArrayList<Sensor>();
    private ArrayList<Integer> sensorReadings = new ArrayList<Integer>();

    public AverageSensor(){

    }

    public void addSensor(Sensor toAdd){

        newSensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean allON = false;

        for(Sensor s: newSensors){

            if (s.isOn()){
                allON = true;
            }
        }

        return allON;
    }

    @Override
    public void setOn() {

        for(Sensor s: newSensors){
            s.setOn();
        }

    }

    @Override
    public void setOff() {
        for(Sensor s: newSensors){
            s.setOff();
        }
    }

    @Override
    public int read() {
        int average = 0;

        for(Sensor s: newSensors){
            average += s.read();
        }

        sensorReadings.add(1);
        return average/newSensors.size();
    }

    public List<Integer> readings(){
        ArrayList<Integer> newReadings = new ArrayList<>();

        for(int i = 0; i < sensorReadings.size(); i++){

            try {
                int reading = newSensors.get(i).read();

                newReadings.add(reading);
            } catch (IndexOutOfBoundsException e) {

            }
        }

        return newReadings;
    }

}
