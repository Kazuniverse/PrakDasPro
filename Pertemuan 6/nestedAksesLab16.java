import java.util.Scanner;

public class nestedAksesLab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa memiliki izin dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah mahasiswa merupakan asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        sc.close();
    }
}