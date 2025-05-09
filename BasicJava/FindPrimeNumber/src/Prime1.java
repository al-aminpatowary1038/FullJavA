import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) throws Exception {
        int n;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = input.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(n + " Is a Prime Number!");
        } else {
            System.out.println(n + " Is Not a Prime Number!!");
        }
        input.close();
    }
}
