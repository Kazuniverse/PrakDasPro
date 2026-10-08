import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int harga, uangMuka, jmlBulan;
        double persentaseBunga = 0.02, bunga;

        System.out.print("Masukkan Harga Barang: ");
        harga = in.nextInt();
        System.out.print("Masukkan Uang Muka: ");
        uangMuka = in.nextInt();
        System.out.print("Masukkan Jumlah Bulan Pencicilan: ");
        jmlBulan = in.nextInt();
        
        bunga = (harga - uangMuka) * persentaseBunga;
        System.out.print("Cicilan Perbulan Adalah Rp." + ((harga - uangMuka) / jmlBulan + bunga));
    }
}
