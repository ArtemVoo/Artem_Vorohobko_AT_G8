package basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println(trainMethodsIf.returnNewInt(6));
        System.out.println(trainMethodsIf.returnNewLong(310));
        System.out.println(trainMethodsIf.returnNewChar('g'));
        System.out.println(trainMethodsIf.returnNewFloat(0.67f));
        System.out.println(trainMethodsIf.returnNewDouble(410));
        trainMethodsIf.returnNewBoolean(false);
    }
}
