package basetask;

public class TrainMethodsObjects {
    public void processMouse(){
        Mouse mouse = new Mouse("Маус", 12);

        System.out.println(mouse.getName());
        System.out.println(mouse.getAge());
        mouse.printMouseDetails();
    }
    public void processSouce(){
        Souce souce = new Souce("Соевый","черного");

        System.out.println(souce.getName());
        System.out.println(souce.getColor());
        souce.printSouceDetails();
    }
    public void processBee(){
        Bee bee = new Bee("мальчик", 12);

        System.out.println(bee.getGender());
        System.out.println(bee.getWeight());
        bee.printBeeDetails();
    }
    public void processObstacle(){
        Obstacle obstacle = new Obstacle("что-то поломалось", "Major");

        System.out.println(obstacle.getDescription());
        System.out.println(obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }
    public void processPineapple(){
        Pineapple pineapple = new Pineapple("Маврикий", 2666.21F);

        System.out.println(pineapple.getGrade());
        System.out.println(pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }

}
