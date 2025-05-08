import java.util.Scanner;

public class VowelConso {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        input.close();
    }

}
