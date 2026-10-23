import java.util.Scanner;

public class BioskopTickets16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        long totalTiketTerjual = 0;
        long totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();
        while (jumlahPelanggan < 0) {
            System.out.print("Jumlah pelanggan tidak boleh negatif. Masukkan ulang: ");
            jumlahPelanggan = sc.nextInt();
        }

        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("Jumlah tiket pelanggan ke-" + (i + 1) + ": ");
            int jumlahTiket = sc.nextInt();

            while (jumlahTiket < 0) {
                System.out.print("Jumlah tiket tidak valid. Masukkan ulang: ");
                jumlahTiket = sc.nextInt();
            }

            long subtotal = (long) jumlahTiket * hargaTiket;
            int persentaseDiskon = jumlahTiket > 10 ? 15 : jumlahTiket > 4 ? 10 : 0;
            long diskon = subtotal * persentaseDiskon / 100;
            long totalBayar = subtotal - diskon;

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Diskon pelanggan: " + persentaseDiskon + "%");
            System.out.println("Total bayar pelanggan: Rp" + totalBayar);
        }

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp" + totalPenjualan);
        sc.close();
    }
}
