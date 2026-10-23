
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang16 {
    public static void main(String[] args) {
        int panjang, luas, lebar;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai Panjang: ");
        panjang = in.nextInt();
        System.out.print("Masukkan Nilai Lebar: ");
        lebar = in.nextInt();
        
        luas = lebar * panjang;

        System.out.print("Luas Dari Persegi Tersebut Adalah " + luas);
    }
}
