import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int perLembar = 500, jilid = 5000, lembar;
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah Lembaran Yang Akan Dicetak: ");
        lembar = in.nextInt();
        
        System.out.print("Total Harga Yang Harus Dibayar: Rp." + (lembar * perLembar + jilid));
    }
}
