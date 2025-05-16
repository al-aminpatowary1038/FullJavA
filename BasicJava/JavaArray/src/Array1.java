public class Array1 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 29;
        array1[1] = 1;
        array1[2] = 5;
        array1[3] = 3;
        array1[4] = 2;
        int len = array1.length;
        System.out.println("Length of array is: " + len);
        int sum = array1[0] + array1[1] + array1[2] + array1[3] + array1[4];
        System.out.println("Sum of array values: " + sum);

    }
}
