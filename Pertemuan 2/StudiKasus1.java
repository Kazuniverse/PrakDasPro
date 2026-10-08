
import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int gajiPokok = 5000000, tunjangan, jmlAnak, totalTunjangan;
        double persentaseSimpanan = 0.1, gajiBersih, simpanan;

        System.out.print("Gaji Pokok: ");
        gajiPokok = in.nextInt();

        System.out.print("Jumlah Anak Pak Danur: ");
        jmlAnak = in.nextInt();

        System.out.print("Nominal Tunjangan: ");
        tunjangan = in.nextInt();

        simpanan = gajiPokok * persentaseSimpanan;
        totalTunjangan = tunjangan * jmlAnak;
        gajiBersih = gajiPokok - simpanan + totalTunjangan;
        System.out.println("\nGaji Bersih Yang DIterima Oleh Pak Danur Adalah Sebesar Rp" + (int) gajiBersih);
    }
}
