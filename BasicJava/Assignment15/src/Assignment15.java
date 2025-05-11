import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {
        int num1, num2, temp, r, sum, count = 0, ncount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Initial Position To Check Armstrong: ");
        num1 = input.nextInt();
        System.out.print("Enter The Last Position To Check Armstrong: ");
        num2 = input.nextInt();
        for (int i = num1; i <= num2; i++) {
            temp = i;
            sum = 0;
            int n = temp;
            ncount = 0;
            while (n != 0) {
                n = n / 10;
                ncount++;
            }
            while (temp != 0) {
                r = temp % 10;
                sum = (int) (sum + Math.pow(r, ncount));
                temp = temp / 10;
            }
            if (i == sum) {
                count++;
                System.out.println(sum);
            }

        }
        System.out.println("Number of Armstrong Number Between " + num1 + " To " + num2 + " = " + count);
        input.close();
    }
}
