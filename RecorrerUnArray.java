import java.sql.SQLOutput;
import java.util.Arrays;

public class RecorrerUnArray {
    public static void main(String[] args) {
        int[] a = {7, -2, 5, 0, 6};

        a[0] = 7;
        a[1] = -2;
        a[2] = 5;
        a[3] = 0;
        a[4] = 6;

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;
        b[5] = 6;
        b[6] = 7;
        b[7] = 8;
        b[8] = 9;
        b[9] = 10;

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        int sum2 = 0;
        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }
        int sumFin = sum + sum2;
        System.out.println("Sumas Arrays = [" + sum + "]" + " + " + "[" + sum2 + "]" + " = " + sumFin);
    }
}
