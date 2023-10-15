package homework.day4.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            String str = String.format("I am %s and I will nest there with %s my family members!", this.name, home.getMass() / this.mass);
            System.out.println(str);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    @Override
    public void crawl(String direction, int distance) {
        String str = String.format("I am %s, my name is %s and I am crawling to %s for %d units", this.getClass().getSimpleName(), this.name, direction, distance);
        System.out.println(str);
        System.out.println("vz-vz-vzz-zz..");
    }
}
