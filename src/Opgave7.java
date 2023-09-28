import java.util.Arrays;
public class Opgave7 {
    public static int[] ligetal(int[] a, int number) {
        int[] result = new int[number];


        for (int i = 0, j = 1; i < number; i++, j += 2) {
            result[i] = j;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        int[] result = ligetal(new int[10], 200);

        for (int a : result) {
            System.out.println(a);
        }
    }
}

