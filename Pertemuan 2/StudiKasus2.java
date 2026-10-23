import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lebarTanah, panjangTanah, diameterKolam, pjgSisiTaman;
        double luasTanah, luasKolam, luasTaman, sisa;

        System.out.print("Lebar Tanah: ");
        lebarTanah = in.nextInt();

        System.out.print("Panjang Tanah: ");
        panjangTanah = in.nextInt();

        System.out.print("Diameter Kolam: ");
        diameterKolam = in.nextInt();

        System.out.print("Panjang Sisi Taman: ");
        pjgSisiTaman = in.nextInt();

        luasTanah = lebarTanah * panjangTanah;
        luasKolam = Math.PI * Math.pow((diameterKolam / 2), 2);
        luasTaman = Math.pow(pjgSisiTaman, 2);

        sisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("Luas Tanah Yang Tersisa Adalah " + sisa + " m");
    }
}
