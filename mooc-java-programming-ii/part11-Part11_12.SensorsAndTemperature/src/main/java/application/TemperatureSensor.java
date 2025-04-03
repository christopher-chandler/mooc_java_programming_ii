package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorState = false;


    public TemperatureSensor(){

    }



    @Override
    public boolean isOn() {
        return sensorState;
    }

    @Override
    public void setOn() {
        sensorState = true;
    }

    @Override
    public void setOff() {
        sensorState = false;
    }

    @Override
    public int read() {

        boolean state = isOn();


        int random = new Random().nextInt(60)-30 ;



        return random;
    }
}
