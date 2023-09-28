import java.util.Arrays;

public class Opgave8 {
    public static String[] overFem(String[] a) {
        int count = a.length;
        int validCount = 0;

        for (int i = 0; i < count; i++) {
            if (a[i].length() < 6) {
                validCount++;
            }
        }



        String[] validStrings = new String[validCount];
        int index = 0;


        for (int i = 0; i < count; i++) {
            if (a[i].length() > 5) {
                validStrings[index++] = a[i];
            }
        }

        return validStrings;
    }
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "jusin";
        array[1] = "Lauge";
        array[2] = "Bulow";
        array[3] = "Diaco";


        String[] result = overFem(array);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
