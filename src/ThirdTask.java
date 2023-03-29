import java.util.Scanner;

public class ThirdTask {

    public String reverse(String string){
        String reversedString = "";
        for (int i = string.length()-1; i >= 0 ; --i) {   //бегает от конца к началу
            reversedString += string.charAt(i);           // charAt  возвращает значение char по указанному индексу.
        }
        return reversedString;
    }

    public boolean isPalindrome(String string){
         return  string.equals(reverse(string));
    }

    public void getResult(String string){
        if(isPalindrome(string)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

//второе решение
    public static Boolean isPalindromeAnotherMethod(String string){
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

}
