package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T x) {
        String str = String.format("I am an object of %s class", x.getClass().getSimpleName());
        System.out.println(str);
    }

    public Object genericMethodTwoGenArgs(T x, T y) {
        return (String.format("We are objects of %s class and %s class", x.getClass().getSimpleName(), y.getClass().getSimpleName()));
    }

    public void genericMethodHalfGenArgs(T x, String str) {
        String str1 = String.format("I got an object of %s class and string with %s characters", x.getClass().getSimpleName(), str.toCharArray().length);
        System.out.println(str1);
    }
}
