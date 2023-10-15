package homework.day4.playground.essence.craft.field;

public class Moped extends Vehicle {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        String str = String.format("I am %s, my name is %s and I am moving from point %d to point %d", this.getClass().getSimpleName(), this.getName(), pointA, pointB);
        System.out.println(str);
        return pointB - pointA;
    }
}
