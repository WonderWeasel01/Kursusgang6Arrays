import java.util.Scanner;

public class Opgave3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array1[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = in.nextInt();
        }
       mintal(array1,10);
        int min = array1[0];
        System.out.println(min);
    }

        public static void mintal(int[] a, int antal) {
            int min = a[0];

            for (int i = 1; i < antal; i++) {
                 if (a[i] < min) {
                    a[i] = min;
                }
            }

        }


}
