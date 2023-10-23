package project.water;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened() {
        isOpened = true;
        degas();
    }

    private void degas(){
        //???????
    }

    private void isOpened() {
    }
}

