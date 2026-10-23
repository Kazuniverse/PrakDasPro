import java.util.Scanner;

public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaKopi = 12000;
        final int hargaTeh = 7000;
        final int hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (atau 'batal' untuk selesai): ");
            namaPelanggan = sc.nextLine().trim();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }

            System.out.print("Jumlah kopi: ");
            int kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            int teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            int roti = sc.nextInt();
            sc.nextLine();

            if (kopi < 0 || teh < 0 || roti < 0) {
                System.out.println("Jumlah item tidak boleh negatif. Transaksi dibatalkan.");
                continue;
            }

            long totalHarga = (long) kopi * hargaKopi
                    + (long) teh * hargaTeh
                    + (long) roti * hargaRoti;
            System.out.println("Total harga untuk " + namaPelanggan + ": Rp" + totalHarga);
        } while (true);

        System.out.println("Input transaksi selesai.");
        sc.close();
    }
}
