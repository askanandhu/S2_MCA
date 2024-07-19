import java.util.Scanner;

class Word {
    Scanner sc = new Scanner(System.in);
    String s;

    Word() {
        System.out.print("Enter a string: ");
        s = sc.nextLine();
    }

    void strFunctions() {
        System.out.println("Lower case: " + s.toLowerCase());
        System.out.println("Upper case: " + s.toUpperCase());
        System.out.println("Length: " + s.length());
        System.out.println("substring(2): " + s.substring(2));
        System.out.println("substring(2, 6): " + s.substring(2, 6));
        System.out.println("trim: " + s.trim());
        System.out.println("indexOf('o'): " + s.indexOf('o'));
        System.out.println("indexOf('o', 10): " + s.indexOf('o', 10));
        System.out.println("concat('CR7'): " + s.concat("CR7"));
    }
}

public class StringManipulation {
    public static void main(String[] args) {
        Word w = new Word();
        w.strFunctions();
    }
}
