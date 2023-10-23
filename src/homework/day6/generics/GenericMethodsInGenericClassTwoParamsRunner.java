package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> genericMethodsInGenericClassString = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(genericMethodsInGenericClassString.genericMethodGenArgs("doom"));
        System.out.println(genericMethodsInGenericClassString.genericMethodGenArgs("boom", "boom"));
        genericMethodsInGenericClassString.genericMethodHalfGenArgs("fuuuu", "foooo");
        genericMethodsInGenericClassString.genericMethodHalfGenArgs("blow", "flow", "dow");

        System.out.println("--------");

        GenericMethodsInGenericClassTwoParams<String, Integer> genericMethodsInGenericClassStringInteger = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(genericMethodsInGenericClassStringInteger.genericMethodGenArgs("bam"));
        System.out.println(genericMethodsInGenericClassStringInteger.genericMethodGenArgs("bom", 3));
        genericMethodsInGenericClassStringInteger.genericMethodHalfGenArgs("sdfsf", "fff");
        genericMethodsInGenericClassStringInteger.genericMethodHalfGenArgs("fda", 2, "fghfgh");

        System.out.println("--------");

        GenericMethodsInGenericClassTwoParams<String, Double> genericMethodsInGenericClassStringDouble = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(genericMethodsInGenericClassStringDouble.genericMethodGenArgs("sdff"));
        System.out.println(genericMethodsInGenericClassStringDouble.genericMethodGenArgs("ffff", 3.2));
        genericMethodsInGenericClassStringDouble.genericMethodHalfGenArgs("nbnbn", "nbnbmb");
        genericMethodsInGenericClassStringDouble.genericMethodHalfGenArgs("ytyt", 5.5, "iiiiii");

        System.out.println("--------");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> genericMethodsInGenericClassStringIntInt = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(genericMethodsInGenericClassStringIntInt.genericMethodGenArgs(7));
        System.out.println(genericMethodsInGenericClassStringIntInt.genericMethodGenArgs(3, 4));
        genericMethodsInGenericClassStringIntInt.genericMethodHalfGenArgs(3, "ttt");
        genericMethodsInGenericClassStringIntInt.genericMethodHalfGenArgs(2, 3, "OMG");

        System.out.println("--------");
    }
}
