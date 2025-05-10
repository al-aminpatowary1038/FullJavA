import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        int n, fibo;
        int first = 0;
        int second = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("which fibonacci number you want to see? ");
        n = input.nextInt();
        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        } else {
            for (int i = 3; i <= n; i++) {
                fibo = first + second;
                first = second;
                second = fibo;
            }
            System.out.println(second);
        }
        input.close();
    }

}
