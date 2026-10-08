
import java.util.Scanner;

public class Segitiga16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan Alas: ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = input.nextInt();
        luas = alas * tinggi / 2;
        System.out.print("Luas Dari Segitiga Tersebut Adalah " + luas);
    }
}
