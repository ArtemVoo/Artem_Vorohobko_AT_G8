package project.boxing;

import project.water.Bubble;
import project.water.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open() throws InterruptedException {
        if (water != null) {
            water.setOpened();
        }
    }

    public void warm(int temperature) {
        if (water != null) {
            water.setTemperature(temperature);
        }
    }
    public Water getWater() {
        return water;
    }

    public Water setWater(Water water) {
        this.water = water;
        return  water;
    }

    public void setBubbles() {
        if(water != null){
            int numOfBubbles = (int) (volume * 1000); //??
            Bubble[] bubbles = new Bubble[numOfBubbles];
            for(int i = 0; i < numOfBubbles; i++){
                bubbles[i] = new Bubble("Gas");
            }
            water.pump();
        }
    }
}
