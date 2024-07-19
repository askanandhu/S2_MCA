import java.util.Scanner;

class SortString {

    Scanner sc = new Scanner(System.in);
    String[] s;
    int size;

    SortString() {
        System.out.print("Enter number of strings: ");
        size = sc.nextInt();
        s = new String[size];
        System.out.print("Enter " + size + " strings: ");
        for (int i = 0; i < size; i++)
            s[i] = sc.next();
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        for (String str : s)
            System.out.print(str + " ");
        System.out.println();
    }
}

public class SortStringMain {
    public static void main(String[] args) {
        SortString s1 = new SortString();
        System.out.println("Original string array:");
        s1.display();
        s1.sort();
        System.out.println("Sorted string array:");
        s1.display();
    }
}
