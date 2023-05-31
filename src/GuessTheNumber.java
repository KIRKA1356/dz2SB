import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void guessTheNumber(){
        System.out.println("Задание 4");
        System.out.println();


        Random random =new Random();
        int value = random.nextInt(101);
        System.out.println("Наше секретное число: " + value + ". Только никому не рассказывайте о бойцовском клубе:)");
        System.out.print("Введите предположительное число(от 0 до 100): ");
        int attempt = new Scanner(System.in).nextInt();
        while (true){
            if (attempt == value){
                System.out.println("Вы угадали! Поздравляем!");
                break;
            } else if (attempt>value && attempt-value<10){
                System.out.println("Наше число меньше, но вы очень близки! Пробуйте еще: ");
                attempt = new Scanner(System.in).nextInt();
            } else if (attempt<value && value -attempt<10){
                System.out.println("Наше число больше, но вы очень близки! Пробуйте еще: ");
                attempt = new Scanner(System.in).nextInt();
            } else if (attempt>value) {
                System.out.println("Наше число меньше! Пробуйте еще: ");
                attempt = new Scanner(System.in).nextInt();
            } else if (attempt<value) {
                System.out.println("Наше число больше! Пробуйте еще: ");
                attempt = new Scanner(System.in).nextInt();
            }
        }
        System.out.println();

    }
}
