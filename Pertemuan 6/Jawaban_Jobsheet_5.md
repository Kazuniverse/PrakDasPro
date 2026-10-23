# Jawaban Jobsheet 5: Pemilihan 2

## Percobaan 1: Nested IF Ujian Skripsi

1. Jika mahasiswa menjawab `No` atau jawaban selain `Ya`, kondisi `equalsIgnoreCase("Ya")` bernilai salah. Program langsung menampilkan bahwa mahasiswa masih memiliki tanggungan kompen. Pemeriksaan jumlah bimbingan berada di dalam IF pertama, sehingga tidak dijalankan.
2. `bimbinganP1 >= 8 && bimbinganP2 >= 4` bernilai benar hanya jika jumlah bimbingan Pembimbing 1 minimal 8 **dan** Pembimbing 2 minimal 4. Jika salah satu syarat tidak terpenuhi, mahasiswa belum dapat mendaftar ujian.
3. Alurnya: program meminta status bebas kompen dan jumlah bimbingan. Jika belum bebas kompen, tampil alasan kompen. Jika bebas kompen, program memeriksa kedua jumlah bimbingan. Jika keduanya memenuhi batas, mahasiswa boleh mendaftar. Jika keduanya kurang, alasan menyebut P1 dan P2; jika hanya P1 kurang, alasan menyebut P1; selain itu P2 yang kurang.

## Percobaan 2: Akses WiFi

1. `||` berarti OR: minimal satu dari status mahasiswa atau dosen harus benar. `&&` berarti AND: bagian kiri dan kanan harus sama-sama benar. `!` membalik nilai boolean, sehingga `!akunDiblokir` benar saat akun tidak diblokir.
2. Karena syarat identitas menggunakan OR, `mahasiswa = false` masih dapat menghasilkan kondisi benar apabila `dosen = true`. Akun tetap harus tidak diblokir.
3. Jika `||` diganti `&&`, pengguna harus sekaligus mahasiswa dan dosen. Data uji 1 (`true, false, false`) dan uji 2 (`false, true, false`) sama-sama ditolak karena masing-masing hanya memenuhi salah satu status.
4. Kondisi `dosen` tidak dievaluasi ketika `mahasiswa` bernilai `true`. Pada OR, hasil sudah pasti benar begitu operand kiri benar.
5. `!akunDiblokir` tidak dievaluasi ketika `(mahasiswa || dosen)` bernilai `false`. Pada AND, hasil sudah pasti salah begitu operand kiri salah.

## Percobaan 3: Akses Laboratorium

| Mahasiswa aktif | Sedang disanksi | Izin dosen | Asisten lab | Hasil                                                   |
| --------------- | --------------- | ---------- | ----------- | ------------------------------------------------------- |
| true            | false           | true       | false       | Akses laboratorium diberikan                            |
| true            | false           | false      | true        | Akses laboratorium diberikan                            |
| true            | false           | false      | false       | Ditolak: membutuhkan izin dosen atau status asisten lab |
| false           | false           | true       | false       | Ditolak: status mahasiswa tidak memenuhi syarat         |

1. Pemeriksaan izin dosen atau status asisten lab berada di dalam IF pertama agar syarat status aktif dan tidak disanksi menjadi gerbang awal. Jika gerbang awal gagal, syarat tingkat kedua tidak mengubah hasil dan tidak perlu diperiksa.
2. `&&` mensyaratkan mahasiswa aktif sekaligus tidak disanksi. `!` membalik nilai `sedangDisanksi`, sedangkan `||` menerima mahasiswa yang memiliki izin dosen atau berstatus asisten lab.
3. Ya. Kondisi gabungan `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)` menghasilkan keputusan akhir akses yang sama. Nested IF lebih mudah menampilkan alasan penolakan berdasarkan tahap yang gagal.
4. Nested IF memisahkan tahapan pemeriksaan dan memungkinkan alasan yang spesifik: status awal tidak memenuhi syarat atau izin/asisten lab belum terpenuhi.
5. Contoh gagal level pertama: `false, false, true, false` (mahasiswa tidak aktif). Contoh gagal level kedua: `true, false, false, false` (aktif, tidak disanksi, tetapi tidak punya izin dan bukan asisten lab).

## Tugas 1: Diskon Toko Buku

Implementasi ada di `tugas1DiskonTokoBukuNoPresensi.java`. Flowchart Latihan 2 Pertemuan 6 tidak disertakan, sehingga program menggunakan asumsi contoh: transaksi minimal Rp100.000 mendapat diskon 10% untuk member atau 5% untuk nonmember; di bawah batas tersebut tidak mendapat diskon. Sesuaikan nilai batas dan persentase di konstanta program apabila flowchart kelas menggunakan aturan berbeda.

## Tugas 2: Seleksi Asisten Praktikum

Implementasi ada di `tugas2SeleksiAsistenNoPresensi.java`. Seleksi dilakukan berurutan: mahasiswa harus aktif dan tidak disanksi; lalu nilai Dasar Pemrograman minimal 80 **atau** memiliki sertifikat; setelah lolos, nilai wawancara minimal 75 untuk diterima. Program menampilkan alasan kegagalan pada tahap yang sesuai.
