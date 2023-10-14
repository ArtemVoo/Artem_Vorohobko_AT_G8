package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        String str = String.format("I am %s, my name is %s and I am flying to %s", Fly.class.getName(), this.getName(), direction);
        System.out.println(str);
    }
}
