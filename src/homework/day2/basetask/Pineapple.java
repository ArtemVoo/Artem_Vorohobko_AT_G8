package homework.day2.basetask;

public class Pineapple {

    private String grade;
    private float heatCapacity;

    public Pineapple(String grade, float heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails() {
        int x = 2140;
        if (x < heatCapacity) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }
}
