import java.util.Scanner;

public class SecondTask {
    String string;
    boolean repeated;

    SecondTask() {
        Scanner in = new Scanner(System.in);    //конструктор, объявляем тут переменные
        string = in.next();
        in.close();
    }

    public StringBuilder getUniqueSequence() {
        StringBuilder result = new StringBuilder();
        char[] chars = string.toCharArray();  //создает из строки массив чаров

        for (int i = 0; i < chars.length; i++) {
            repeated = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result.append(chars[i]);
            }
        }
        return result;
    }


}
