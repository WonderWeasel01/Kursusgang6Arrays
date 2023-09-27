import java.util.Scanner;

public class Opgave4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array1[] = new int[10];
        int count = array1.length;

        for (int i = 0; i < count; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println(udregnMax(array1));
    }

    public static int udregnMax(int[] a) {
        int max = a[0];
        int count = a.length;

        for (int i = 0; i < count; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }
}
