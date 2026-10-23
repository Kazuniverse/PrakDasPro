public class tryj {
    public static void main(String[] args) {
        int harga = 10000, potongan, jml;
        double diskonP = 0.15;

        
        harga -= (int) (harga * diskonP);
        System.out.println(harga);
    }
}