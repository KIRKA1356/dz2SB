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
            intermediateValue = i * (i-1); //Умножение числа которое ввел пользователь на число идущее перед ним
            actionValue = actionValue * intermediateValue;
            intermediateValue = 0;
            i = i-2; //Откат итератора на 2 от введенного числа, так как они уже переумножены

        }
        System.out.println("Факториал числа " + value + " равен " + actionValue);
        System.out.println();
    }
}
