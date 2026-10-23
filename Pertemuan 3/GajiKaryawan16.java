import java.util.Scanner;

public class GajiKaryawan16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji, tunjTransport = 600000, tunjMkn = 400000;

        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = in.nextInt();
        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransport + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus Bulanan Anda Adalah Rp." + bonus);
        System.out.println("Gaji Yang Diterima Adalah Rp." + (int)totGaji);
    }
}
