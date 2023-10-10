package basetask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();

        trainMethodsPrimitive.printInt(5);
        trainMethodsPrimitive.printLong(123);
        trainMethodsPrimitive.printChar('G');
        trainMethodsPrimitive.printFloat(1.2f);
        trainMethodsPrimitive.printDouble(5.7);
        trainMethodsPrimitive.printShort((short) 4);
        trainMethodsPrimitive.printByte((byte) 9);
        trainMethodsPrimitive.printBoolean(true);
    }
}
