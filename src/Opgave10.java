import java.util.Scanner;

public class Opgave10 {

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int list[] = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = in.nextInt();
        }
        System.out.println(linearSearch(list, 55));
    }
}