import java.util.Scanner;

public class Opgave3 {
    public static int udregnMin(int[] a) {
        int min = a[0];
        int count = a.length;

        for (int i = 0; i < count; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array1[] = new int[5];
        int count = array1.length;

        for (int i = 0; i < count; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println(udregnMin(array1));
    }
}
