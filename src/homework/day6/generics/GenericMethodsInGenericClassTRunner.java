package homework.day6.generics;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.creatures.Crocodile;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassString = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassString.genericMethodOneGenArg("yeah");
        System.out.println(genericMethodsInGenericClassString.genericMethodTwoGenArgs("hello", "bye"));
        genericMethodsInGenericClassString.genericMethodHalfGenArgs("pffff", "bombom");

        System.out.println("--------");

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassInteger = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassInteger.genericMethodOneGenArg(5);
        System.out.println(genericMethodsInGenericClassInteger.genericMethodTwoGenArgs(2, 3));
        genericMethodsInGenericClassInteger.genericMethodHalfGenArgs(5, "two");

        System.out.println("--------");

        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassDouble = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassDouble.genericMethodOneGenArg(2.2);
        System.out.println(genericMethodsInGenericClassDouble.genericMethodTwoGenArgs(2.1, 5.5));
        genericMethodsInGenericClassDouble.genericMethodHalfGenArgs(3.7, "boom");

        System.out.println("--------");

    }
}
