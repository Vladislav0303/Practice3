import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        byte bytevalue = 100;
        int intvalue = 50;
        int MAX_VALUE = bytevalue;
        int MIN_VALUE = intvalue;

        System.out.println("byte: " + bytevalue);
        System.out.println("int: " + intvalue);
        System.out.println("Max: " + MAX_VALUE);
        System.out.println("Min: " + MIN_VALUE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тип даних double: ");
        scanner.nextLine();
        double doubleValue = 3.14;
        int intValue = (int) doubleValue;
        System.out.println("double значення: " + doubleValue);
        System.out.println("int значення: " + intValue);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть тип даних int: ");
        scanner.nextLine();
        int intValue1 = 35;
        double doubleValue1 = intValue1;
        System.out.println("int значення: " + intValue1);
        System.out.println("double значення: " + doubleValue1);




    }
}