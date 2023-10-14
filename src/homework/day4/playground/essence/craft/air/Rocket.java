package homework.day4.playground.essence.craft.air;

public class Rocket extends Aircraft {
    public Rocket(int mass, String name) {
        super(mass, name);
    }
    @Override
    public void fly(String direction) {
        String str = String.format("I am %s, my name is %s and I am flying to %s", Rocket.class.getName(), this.getName(), direction);
        System.out.println(str);
    }
}
