import java.util.*;
public class ForCycle {
    public static void forCycle(){
        System.out.println("Задание 2");
        System.out.println();


        System.out.println("Введите число: ");
        double value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            double verificationVariable = 0;
            verificationVariable = value/i;
            if (Math.floor(verificationVariable) == verificationVariable){
                System.out.println("Подходит: " + i + " * " + verificationVariable);
                verificationVariable = 0;
            }
        }
        System.out.println();

    }
}
