package homework.day4.playground.essence.craft.field;

public class Car extends Vehicle {
    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        String str = String.format("I am %s, my name is %s and I am moving from point %d to point %d", this.getClass().getSimpleName(), this.getName(), pointA, pointB);
        System.out.println(str);
        return pointB - pointA;
    }

    @Override
    public void drive(String direction) {
        String str = String.format("I am %s, my name is %s and I am driving to %s", this.getClass().getSimpleName(), this.getName(), direction);
        System.out.println(str);
    }
}

