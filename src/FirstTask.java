import java.util.Scanner;

public class FirstTask {
        int n;
        char a;
        char b;
        int count = 0;

        FirstTask(){
                Scanner in = new Scanner(System.in);
                System.out.println("Введите четное число");
                n = in.nextInt();
                System.out.println("Введите два символа");
                a = in.next().charAt(0);
                b = in.next().charAt(0);
                in.close();

        }

        public boolean isOdd(int n) {
                if (n % 2 == 0) {
                        return true;
                } else {
                        System.out.println("Введите число не четное");
                        return false;
                }
        }

        public void getResult(){
                if (isOdd(n)){
                        StringBuilder result = new StringBuilder();
                        while (n != count){
                                result.append(a).append(b);
                                count += 2;
                        }
                        System.out.println(result);
                }
        }


}
