//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class fibonacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, temp, jumlah, n, i;

        n = Integer.parseInt(input.nextLine());
        a = 1;
        b = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + a;
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(jumlah);
    }
}
