import java.util.Scanner;

public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " (0-100): ");
                nilai = sc.nextDouble();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                    continue;
                }
                break;
            }

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        sc.close();
    }
}
