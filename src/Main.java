import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Default array values
        Scanner in = new Scanner(System.in);
        int array1[] = new int[5];

        //Test opgave
        int x1, x2, x3, x4, x5;


        x1 = in.nextInt();
        x2 = in.nextInt();
        x3 = in.nextInt();
        x4 = in.nextInt();
        x5 = in.nextInt();


        if (x1 >= 15) {
            System.out.println(x1 + " er større end 15");
        }

        if (x2 >= 15) {
            System.out.println(x2 + " er større end 15");
        }

        if (x3 >= 15) {
            System.out.println(x3 + " er større end 15");
        }

        if (x4 >= 15) {
            System.out.println(x4 + " er større end 15");
        }

        if (x5 >= 15) {
            System.out.println(x5 + " er større end 15");
        }

        //test opgave2


        if (array1[x1] > 15) {
            System.out.println(array1[x1]);
        }


        //Opgave 1
        int array2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = in.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(array2[i]);
        }

        for (int i = 0; i < 10; i++) {
            //    array2[i] += 2;
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(array2[i]);
        }
        int min = array2[0];
        for (int i = 1; i < 10; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }

        System.out.println("Det mindste tal er: " + min);

        int max = array2[0];
        for (int i = 1; i < 10; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }

        System.out.println("Det højeste tal er: " + max);

        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += array2[i];

        double snit = sum / 10.0;
        System.out.println("Gennemsnittet er " + snit);


    }

}
