import java.text.Format;
import java.time.LocalDateTime;
import java.util.Scanner;  // нужно делать чтоб считывать данные из кансоли

public class Seminar_1 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(LocalDateTime.now());
// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
//
//        Scanner sc = new Scanner(System.in);  // это инпут
//        System.out.print("Type your name: ");
//        String name = sc.nextLine();
//        System.out.printf("Hello %s", name);  // %s означает что строковый вывод
//        sc.close();  // нужно закрывать


//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        int[] array = {1, 0, 1, 1, 0, 1, 1, 1};
        int currentMax = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                currentMax++;
                if (currentMax > max) {
                    max = currentMax;
                }
            } else {
                currentMax = 0;
            }
        }
        System.out.println(max);

    }
}







