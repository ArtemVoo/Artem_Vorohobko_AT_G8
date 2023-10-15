package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        transportable.move(pointA, pointB);
        String str = String.format("Transportable %s was moved to %d points", this.getClass().getSimpleName(), transportable.move(pointA, pointB));
        System.out.println(str);
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        String str = String.format("Transportable %s was moved to %d points", this.getClass().getSimpleName(), transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate()));
        System.out.println(str);
    }
}
