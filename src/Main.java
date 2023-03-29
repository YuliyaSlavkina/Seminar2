import com.sun.source.util.SourcePositions;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Дано четное число N (>0) и символы c1 и c2.
//   Написать метод, который вернет строку длины N, которая
//   состоит из чередующихся символов c1 и c2, начиная с c1.

//        FirstTask task1 = new FirstTask();
//        task1.getResult();

//    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.

//        SecondTask secondTask = new SecondTask();
//        System.out.println(secondTask.getUniqueSequence());


//        Напишите метод, который принимает на вход строку (String) и
//        определяет является ли строка палиндромом (возвращает
//        boolean значение).


//        ThirdTask thirdTask = new ThirdTask();
//        Scanner in = new Scanner(System.in);
//        String string = in.next();
//        in.close();
//        thirdTask.getResult(string);
//        System.out.println(ThirdTask.isPalindromeAnotherMethod(string));   //второе решение


//        Напишите метод, который составит строку, состоящую из 100
//        повторений слова TEST и метод, который запишет эту строку в
//        простой текстовый файл, обработайте исключения.


        FourthTask fourthTask = new FourthTask();
        try {
            fourthTask.writer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}