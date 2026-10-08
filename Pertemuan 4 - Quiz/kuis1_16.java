/*

    DEKLARASI
    int bulanLalu, ppj, bulanIni, bulanLalu, tarifPerKwh = 1450, bebanTetap, total, jumlahPemakaian, biayaPemakaian
    double persentasePpj = 0.1
    String nama

    INPUT
    nama, besar pemakaian bulanLalu & bulanIni

    PROSES
    jumlahPemakaian = bulanIni - bulanLalu
    biayaPemakaian = jumlahPemakaian * tarifPerKwh
    ppj = (int) (biayaPemakaian * persentasePpj)
    total = biayaPemakaian + bebanTetap + ppj

    OUTPUT
    nama, jumlahPemakaian, biayaPemakaian, ppj, total

*/
import java.util.Scanner;

public class kuis1_16 {
    public static void main(String[] args) {
        int bulanLalu, ppj, bulanIni, tarifPerKwh = 1450, bebanTetap = 20000, total, jumlahPemakaian, biayaPemakaian;
        double persentasePpj = 0.1;
        String nama;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan: ");
        nama = in.nextLine();
        System.out.print("Besar Pemakaian Bulan Lalu (kWh): ");
        bulanLalu = in.nextInt();
        System.out.print("Besar Pemakaian Bulan Ini (kWh): ");
        bulanIni = in.nextInt();

        jumlahPemakaian = bulanIni - bulanLalu;
        biayaPemakaian = jumlahPemakaian * tarifPerKwh;
        ppj = (int) (biayaPemakaian * persentasePpj);
        total = biayaPemakaian + bebanTetap + ppj;

        System.out.println("\nNama Pelanggan      : " + nama);
        System.out.println("Jumlah Pemakaian    : " + jumlahPemakaian + "kWh");
        System.out.println("Biaya Pemakaian     : Rp." + biayaPemakaian);
        System.out.println("Besar PPJ           : Rp." + ppj);
        System.out.println("Total Tagihan       : Rp." + total);
    }
}