package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public Object genericMethodGenArgs(X x) {
        return (String.format("I received %s argument of type: %s class", 1, x.getClass().getSimpleName()));
    }

    public Object genericMethodGenArgs(X x, Y y) {
        return (String.format("I received %s arguments of type: %s class, %s class", 2, x.getClass().getSimpleName(), y.getClass().getSimpleName()));
    }

    public void genericMethodHalfGenArgs(X x, String str) {
        String str1 = String.format("I got an object of %s class and %s class and string with %s characters", x.getClass().getSimpleName(), str.getClass().getSimpleName(), str.toCharArray().length);
        System.out.println(str1);
    }

    public void genericMethodHalfGenArgs(X x, Y y, String str) {
        String str3 = String.format("I got an object of %s class and %s class and string with %s characters", x.getClass().getSimpleName(), y.getClass().getSimpleName(), str.toCharArray().length);
        System.out.println(str3);
    }

}
