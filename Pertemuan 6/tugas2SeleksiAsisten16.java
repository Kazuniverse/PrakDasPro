import java.util.Scanner;

public class tugas2SeleksiAsisten16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDasarPemrograman = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean memilikiSertifikat = sc.nextBoolean();

            if (nilaiDasarPemrograman >= 80 || memilikiSertifikat) {
                System.out.println("Mahasiswa lolos seleksi administrasi dan dipanggil untuk wawancara.");
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat, mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal: nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("Gagal: nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }
        } else if (!mahasiswaAktif && sedangDisanksi) {
            System.out.println("Gagal: status mahasiswa tidak aktif dan sedang mendapat sanksi akademik.");
        } else if (!mahasiswaAktif) {
            System.out.println("Gagal: status mahasiswa tidak aktif.");
        } else {
            System.out.println("Gagal: mahasiswa sedang mendapat sanksi akademik.");
        }

        sc.close();
    }
}