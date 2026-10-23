//Khafid Zaifuddin Rohman - 264107020085 - TI 1H - 16

import java.util.Scanner;

public class UTS_16_Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean diKampus;
        int jumlahPorsi, diskon, biayaAntar, total, totalSetelahDiskon,totalBayar;
        double persenDiskon;

        System.out.print("Nama Panitia Pemesan  : ");
        String nama = in.nextLine().trim();

        System.out.print("Jumlah Porsi          : ");
        jumlahPorsi = in.nextInt();

        total = jumlahPorsi * 25000;

        if (jumlahPorsi <= 0) {
            System.out.println("Pemesanan Gagal: Jumlah Porsi Tidak Valid!");
            in.close();
            return;
        } else {
            System.out.println("Lokasi Di Dalam Kampus? (True/False)");
            diKampus = in.nextBoolean();

            System.out.print("Jumlah Hari Pemesanan Sebelum Hari-H  : ");
            int sebelumHariH = in.nextInt();

            if (sebelumHariH >= 3 && sebelumHariH <= 30) {
                if (jumlahPorsi > 0 && jumlahPorsi < 50) {
                    persenDiskon = 0;
                } else if (jumlahPorsi >= 50 && jumlahPorsi <= 100) {
                    persenDiskon = 0.05;
                } else if (jumlahPorsi > 100) {
                    persenDiskon = 0.1;
                } else {
                    System.out.println("Pemesanan Gagal: Jumlah Porsi Tidak Valid!");
                    in.close();
                    return;
                }

                System.out.println("Proposal Sudah Disetujuai? (True/False)");
                boolean proposal = in.nextBoolean();

                System.out.println("Pembayaran Sudah Lunas? (True/False)");
                boolean pembayaran = in.nextBoolean();

                if (proposal || pembayaran) {
                    if (diKampus == true || jumlahPorsi > 150) {
                    biayaAntar = 0;
                    } else {
                        biayaAntar = 30000;
                    }

                    diskon = (int)(total * persenDiskon);
                    totalSetelahDiskon = total - diskon;
                    totalBayar = totalSetelahDiskon + biayaAntar;

                    System.out.println("\nPemesanan Berhasil!");

                    System.out.println("Nama Panitia Pemesan    : " + nama);
                    System.out.println("Jumlah Porsi            : " + jumlahPorsi);
                    System.out.println("Total Sebelum diskon    : Rp" + total);
                    System.out.println("Persentase Diskon       : " + (int)(persenDiskon * 100)+ "%");
                    System.out.println("Nilai Diskon            : Rp" + diskon);
                    System.out.println("Total Setelah Diskon    : Rp" + totalSetelahDiskon);
                    System.out.println("Biaya Antar             : Rp" + biayaAntar);
                    System.out.println("Total Yang Harus Dibayar: Rp" + totalBayar);

                    in.close();
                } else {
                    System.out.println("Pemesanan gagal: belum ada persetujuan proposal maupun pelunasan.");
                    in.close();
                    return;
                }
            } else {
                System.out.println("Pemesanan gagal: pemesanan harus dilakukan H-3 sampai H-30.");
                in.close();
                return;
            }
        }
    }
}