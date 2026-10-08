/**
 * MenghitungTotalBayar16
 */
import java.util.Scanner;

public class MenghitungTotalBayar16 {
    public static void main(String[] args) {
        // int harga;
        double potongan, jml_bayar, diskon = 0.15, harga;

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Harga: ");
        harga = in.nextInt();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;

        System.out.print("Total harga yang harus dibayar adalah Rp." + jml_bayar);
    }
}