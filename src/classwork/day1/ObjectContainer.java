package classwork.day1;

public class ObjectContainer {
    Object[] array = new Object[10];
    int x = 0;

    public void add(Object incoming) {
        if (x < 10) {
            array[x++] = incoming;
        }
    }

    public Object removeLast() {
        Object objectR = null;
        if (x > 0) {
            objectR = array[x-- - 1];

        }
        return objectR;
    }

    public boolean isEmpty() {
        return x == 0;
    }
}
