import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class tugas1DiskonTokoBuku16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc.nextLine().trim();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();
        System.out.print("Masukkan harga satuan buku: Rp");
        double hargaSatuan = sc.nextDouble();

        if (jumlahBuku <= 0 || hargaSatuan < 0) {
            System.out.println("Jumlah buku harus lebih dari 0 dan harga tidak boleh negatif.");
            sc.close();
            return;
        }

        double persentaseDiskon = 0;
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            persentaseDiskon = 10;
            if (jumlahBuku > 2) {
                persentaseDiskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            persentaseDiskon = 7;
            if (jumlahBuku > 3) {
                persentaseDiskon += 2;
            } else {
                persentaseDiskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                persentaseDiskon = 5;
            }
        }

        double totalBelanja = jumlahBuku * hargaSatuan;
        double jumlahDiskon = totalBelanja * persentaseDiskon;
        jumlahDiskon /= 100;
        double totalBayar = totalBelanja - jumlahDiskon;

        System.out.println("Total belanja: " + rupiah.format(totalBelanja));
        System.out.println("Persentase diskon: " + persentaseDiskon + "%");
        System.out.println("Jumlah diskon: " + rupiah.format(jumlahDiskon));
        System.out.println("Total yang harus dibayar: " + rupiah.format(totalBayar));

        sc.close();
    }
}