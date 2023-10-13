package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(String name, int mass) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void String(String name) {
        this.name = name;
    }
}
