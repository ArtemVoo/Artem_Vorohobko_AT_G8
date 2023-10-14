package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String str = String.format("I am %s and I am eating %s", this.name, food.getName());
        System.out.println(str);
    }
}
