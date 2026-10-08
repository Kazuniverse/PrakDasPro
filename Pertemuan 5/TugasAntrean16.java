import java.util.Scanner;

public class TugasAntrean16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MESIN ANTREAN DIGITAL AKADEMIK ===");
        System.out.println("Kode Layanan:");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("\nLayanan : Legalisir Ijazah");
                System.out.println("Loket   : Loket A");
                break;
            case 2:
                System.out.println("\nLayanan : Surat Keterangan Aktif Kuliah");
                System.out.println("Loket   : Loket B");
                break;
            case 3:
                System.out.println("\nLayanan : Pembayaran UKT");
                System.out.println("Loket   : Loket C");
                break;
            case 4:
                System.out.println("\nLayanan : Pengajuan Cuti Akademik");
                System.out.println("Loket   : Loket D");
                break;
            default:
                System.out.println("\nKode layanan tidak valid!");
        }

        sc.close();
    }
}