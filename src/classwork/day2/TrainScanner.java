package classwork.day2;

import java.util.Scanner;

public class TrainScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text!", incoming);
            if (incoming.equalsIgnoreCase("stop")) {
                return;
            }
        }
    }
}