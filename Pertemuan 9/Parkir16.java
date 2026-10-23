import java.util.Scanner;

public class Parkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalPembayaran = 0;

        while (true) {
            System.out.println("Pilih kendaraan: 1 = mobil, 2 = motor, 0 = selesai");
            System.out.print("Pilihan: ");
            int jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.print("Lama parkir (jam): ");
            int lamaParkir = sc.nextInt();
            if (lamaParkir < 0) {
                System.out.println("Lama parkir tidak boleh negatif.");
                continue;
            }

            int tarifPerJam = jenisKendaraan == 1 ? 3000 : 2000;
            long pembayaran = (long) lamaParkir * tarifPerJam;
            totalPembayaran += pembayaran;

            String kendaraan = jenisKendaraan == 1 ? "Mobil" : "Motor";
            System.out.println("Pembayaran " + kendaraan + ": Rp" + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp" + totalPembayaran);
        sc.close();
    }
}
