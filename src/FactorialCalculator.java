import java.util.Scanner;

public class FactorialCalculator {
    public static void factorialCalculator() {
        System.out.println("Задание 1");
        System.out.println();


        System.out.print("Введите свое число в консоль: ");
        int value = new Scanner(System.in).nextInt();
        int intermediateValue = 0;
        int actionValue = 1;
        for (int i = value; i > 1; ) {
            intermediateValue = i * (i-1);
            actionValue = actionValue * intermediateValue;
            intermediateValue = 0;
            i = i-2;

        }
        System.out.println("Факториал числа " + value + " равен " + actionValue);
        System.out.println();
    }
}
