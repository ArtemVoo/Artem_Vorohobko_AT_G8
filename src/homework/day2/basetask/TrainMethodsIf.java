package homework.day2.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int x) {

        if (x < 8) {
            return x * 7;
        } else {
            return x / 4;
        }
    }

    public long returnNewLong(long y) {

        if (y > 300) {
            return y - 300;
        } else {
            return y + 20;
        }
    }

    public String returnNewChar(char z) {

        String str1 = "go";
        String str2 = z + "o";

        if (z == 'g') {
            return str1;
        } else {
            return str2;
        }
    }

    public float returnNewFloat(float p) {

        if (p == 0.67F) {
            return (p);
        } else {
            return p * 2;

        }
    }

    public double returnNewDouble(double b) {

        if (b > 30 & b < 80) {
            return b + 87;
        } else if (b > 80 & b < 400) {
            return b - 87;
        } else if (b > 400) {
            return b / 4;
        } else {
            return b;
        }

    }

    public void returnNewBoolean(boolean q) {

        if (q == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
