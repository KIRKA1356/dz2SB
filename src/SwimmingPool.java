import java.util.Scanner;

public class SwimmingPool {
    public static void swimmingPool(){
        System.out.println("Задание 3");
        System.out.println();


        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        double min = 0;

        System.out.println("Укажите сколько литров в бассейне на данный момент: ");
        double startVolume = new Scanner(System.in).nextInt();
        double sumVolume = startVolume;

        while (sumVolume<volume){
           sumVolume = sumVolume +fillingSpeed - devastationSpeed;
           min = min + 1;
        }

        if(sumVolume>volume){
            sumVolume = sumVolume -volume;
            double absoluteIncrease = fillingSpeed - devastationSpeed;
            double remainingTime = sumVolume/absoluteIncrease;
            min = min - 1 + remainingTime;
        }

        System.out.println("Бассейн набереться за " + min + " минут");
        System.out.println();
    }
}
