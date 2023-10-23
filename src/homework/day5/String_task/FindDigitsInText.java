package homework.day5.String_task;

public class FindDigitsInText {
    public void findDigits(String text) {
        for (char x : text.toCharArray()) {
            if (Character.isDigit(x)) {
                System.out.println(x);
            }
        }
    }
}
