package classwork.day1;

public class ObjectContainerRunner {

    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();

        objectContainer.add(1);
        objectContainer.add(2);
        objectContainer.add(4);
        objectContainer.add(14);
        objectContainer.add(9);

        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }
    }
}





