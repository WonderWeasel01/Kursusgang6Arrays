import java.util.Scanner;

public class Opgave2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array1[] = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println(udregnSum(array1));
    }

    public static double udregnSum(int[] a) {
        int sum = 0;
        int count = a.length;

        for (int i = 0; i < 5; i++) {
            if (a[i] != 0) {
                sum += a[i];
            } else {
                break;
            }
        }

        double snit = (double) sum / count; // Calculate the average

        return snit;
    }
}