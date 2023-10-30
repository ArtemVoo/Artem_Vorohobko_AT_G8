package homework.day8.collections.collectionT;

import homework.day8.collections.content.Water;

import java.util.Arrays;
import java.util.List;

public class WaterManipulation {

    public static void main(String[] args) {
        List<Water> water
                = Arrays.asList(new Water("Прозрачная",
                "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for(Water s : water){
            System.out.println(s.getColor() + " " + s.getSmell());
        }
    }
}
