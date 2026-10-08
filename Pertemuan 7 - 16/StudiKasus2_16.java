import java.util.Scanner;

public class StudiKasus2_16 {
    public static void main(String[] args) {
        int jumlahDokumen, peringkatJuara;
        Boolean statusPendanaan = true;
        String namaMahasiswa, cabangLomba, pendanaan;

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa                   : ");
        namaMahasiswa = in.nextLine().trim();
        System.out.println("[BELMAWA] - [BAKORMA] - [Mandiri] - [PKM] - [Lainnya]");
        System.out.print("Jenis Lomba Yang Diikuti                  : ");
        cabangLomba = in.nextLine().trim();
        System.out.print("Jumlah Dokumen Yang Telah Diupload        : ");
        jumlahDokumen = in.nextInt();
        System.out.print("Peringkat Mahasiswa (0 jika bukan 1-3)    : ");
        peringkatJuara = in.nextInt();

        if (jumlahDokumen >= 0 && jumlahDokumen <= 4) {
            if (peringkatJuara > 0 && peringkatJuara <= 3) {
                if (cabangLomba.equals("BELMAWA") || cabangLomba.equals("BAKORMA") || cabangLomba.equals("Mandiri")) {

                    System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
                    System.out.println("Jenis Kegiatan  : " + cabangLomba);
                    System.out.println("Jumlah Dokumen  : " + jumlahDokumen);
                    System.out.println("Peringkat Juara : " + peringkatJuara);
                    System.out.println("Status          : Lolos pemberian dana penghargaan");
                } else {
                    System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
                    System.out.println("Jenis Kegiatan  : " + cabangLomba);
                    System.out.println("Jumlah Dokumen  : " + jumlahDokumen);
                    System.out.println("Peringkat Juara : " + peringkatJuara);
                    System.out.println("Status          : Lolos pemberian dana penghargaan");
                }
            } else if (cabangLomba.equalsIgnoreCase("PKM")) {
                System.out.print("Lolos Penadaan    : ");
                statusPendanaan = in.nextBoolean();
                pendanaan = statusPendanaan ? "Lolos dana pendanaan" : "Tidak lolos dana pendanaan";

                System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
                System.out.println("Jenis Kegiatan  : " + cabangLomba);
                System.out.println("Jumlah Dokumen  : " + jumlahDokumen);
                System.out.println("Peringkat Juara : " + peringkatJuara);
                System.out.println("Status          : " + pendanaan);                
            } else {
                System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
                System.out.println("Jenis Kegiatan  : " + cabangLomba);
                System.out.println("Jumlah Dokumen  : " + jumlahDokumen);
                System.out.println("Peringkat Juara : " + peringkatJuara);
                System.out.println("Status          : Tidak masuk peringkat juara, tidak lolos dana penghargaan");
            }
        } else {
            System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
            System.out.println("Jenis Kegiatan  : " + cabangLomba);
            System.out.println("Jumlah Dokumen  : " + jumlahDokumen);
            System.out.println("Peringkat Juara : " + peringkatJuara);
            System.out.println("Status          : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + "), dana penghargaan tidak diberikan");
        }
    }
}
