
public class ContohVariable16 {
    public static void main(String[] args) {
        String hobiku = "Bersepeda";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur  = 20;
        double ipk = 4.00, tinggi = 1.64;

        System.out.println(hobiku);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur );
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi + "m"));
    }
}