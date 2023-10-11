package homework.day2.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод <returnNewInt> вернул :" + trainMethodsReturn.returnNewInt(2));
        System.out.println("метод <returnNewLong> вернул :" + trainMethodsReturn.returnNewLong(400));
        System.out.println("метод <returnNewChar> вернул :" + trainMethodsReturn.returnNewChar('T'));
        System.out.println("метод <returnNewFloat> вернул :" + trainMethodsReturn.returnNewFloat(1.2f));
        System.out.println("метод <returnNewDouble> вернул :" + trainMethodsReturn.returnNewDouble(2.3));
        System.out.println("метод <returnNewShort> вернул :" + trainMethodsReturn.returnNewShort((short) 7));
        System.out.println("метод <returnNewByte> вернул :" + trainMethodsReturn.returnNewByte((byte) 3));
        System.out.println("метод <returnNewBoolean> вернул :" + trainMethodsReturn.returnNewBoolean(true));
    }
}
