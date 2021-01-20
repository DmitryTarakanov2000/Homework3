import java.util.Random;
import java.util.Scanner;

public class Pract1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random b = new Random();
        int popitka = 0;
        int random = b.nextInt(9);
        System.out.println("Угадйте число от 0 до 9.У вас есть 3 попытки");

        while (popitka < 3) {
            System.out.println("Введите число от 0 до 9");
            int chiclo = a.nextInt();
            if (chiclo > random) {
                System.out.println("Число меньше");
            } else if (chiclo < random) {
                System.out.println("Число больше");
            } else if (chiclo == random) {
                System.out.println("Верно");
            }

            popitka++;
        }
        System.out.println("попытки закончились.Начать заново? 1-да 0-нет");
        int otvet = a.nextInt();
        if(otvet == 1){
            main(null);

    }

    }
}

