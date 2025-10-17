//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class kalkulator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int penjumlahan, pengurangan, perkalian, pembagian;
        String pilihan;
        int a, b;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            a = Integer.parseInt(input.nextLine());
            b = Integer.parseInt(input.nextLine());
            penjumlahan = a + b;
            System.out.println(penjumlahan);
        } else {
            if (pilihan.equals("2")) {
                a = Integer.parseInt(input.nextLine());
                b = Integer.parseInt(input.nextLine());
                pengurangan = a - b;
                System.out.println(pengurangan);
            } else {
                if (pilihan.equals("3")) {
                    a = Integer.parseInt(input.nextLine());
                    b = Integer.parseInt(input.nextLine());
                    perkalian = a * b;
                    System.out.println(perkalian);
                } else {
                    if (pilihan.equals("4")) {
                        a = Integer.parseInt(input.nextLine());
                        b = Integer.parseInt(input.nextLine());
                        pembagian = (double) a / b;
                        System.out.println(pembagian);
                    }
                }
            }
        }
    }
}
