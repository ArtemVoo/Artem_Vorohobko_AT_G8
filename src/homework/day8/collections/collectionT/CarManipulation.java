package homework.day8.collections.collectionT;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarManipulation {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");


        try {
            FileWriter writer = new FileWriter("cars.txt");

            for (String s : cars) {
                writer.write("\"" + s + "\"\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            String car = iterator.next();
            if(car.length() > 4){
                iterator.remove();
            }
        }
        for(String s : cars){
            System.out.print(s + " ");
        }
    }
}

