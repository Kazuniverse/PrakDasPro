import java.util.Scanner;

public class Bank16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double persentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.print("Masukkan Jumla Tabungan Awal Anda: ");
        jml_tabungan_awal = inp.nextInt();
        System.out.print("Masukkan Lama Anda Menabung: ");
        lama_menabung = inp.nextInt();
        
        bunga = lama_menabung * persentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga: " + bunga);
        System.out.println("Jumlah Tabungan Akhir Anda: " + jml_tabungan_akhir);
    }
}