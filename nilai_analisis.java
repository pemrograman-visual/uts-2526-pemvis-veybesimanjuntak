//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, mahasiswa;
        double nilaiRataRata, nilaiTertinggi, nilaiTerendah, total;
        double[] nilaiSiswa = new double[4];

        total = 0;
        mahasiswa = Integer.parseInt(input.nextLine());
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ":");
            nilaiSiswa[i] = Double.parseDouble(input.nextLine());
            total = total + nilaiSiswa[i];
        }
        nilaiRataRata = total / 4;
        nilaiTertinggi = nilaiSiswa[0];
        for (i = 1; i <= 3; i++) {
            if (nilaiSiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiSiswa[i];
            }
        }
        nilaiTerendah = nilaiSiswa[0];
        for (i = 1; i <= 3; i++) {
            if (nilaiSiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiSiswa[i];
            }
        }
        System.out.println("Rata-rata = " + nilaiRataRata);
        System.out.println("Tertinggi = " + nilaiTertinggi);
        System.out.println("Terendah = " + nilaiTerendah);
    }
}
