package classwork.day4;

public class ObRunner {
    public static void main(String[] args) {
        MyObClass myObClass = new MyObClass();
        myObClass.justMethod(ClassX::new);
    }
}
