import java.util.Scanner;

public class StudiKasus1_16 {
    public static void main(String[] args) {
        int hargaPerCup = 18000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa Banyak Cup Yang Kamu Mau?");
        jumlahCup = in.nextInt();

        if (jumlahCup <= 0) {
            System.out.println("Jumlah Cup Tidak Valid!");
            in.close();
            return;
        }

        System.out.print("Berapa Banyak Yang Kamu Bayar?");
        uangBayar = in.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Total Bayar : " + totalBayar);

        if (uangBayar >= totalHarga) {
            kembalian = uangBayar - totalHarga;
            System.out.println("Kembalian   : " + kembalian);
        } else {
            kurang = totalHarga - uangBayar;
            System.out.println("kurang      : " + kurang);
        }

        in.close();;
    }
}