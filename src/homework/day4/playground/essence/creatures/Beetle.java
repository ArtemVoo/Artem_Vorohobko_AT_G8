package homework.day4.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(String name, int mass) {
        super(name, mass);
    }

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            String str = String.format("I am %s and I will nest there with %s my family members!", this.name, home.getMass() / this.mass);
            System.out.println(str);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
