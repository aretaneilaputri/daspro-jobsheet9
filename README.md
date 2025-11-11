# daspro-jobsheet9
Pertanyaan Percobaan 1:
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
Jawab:Jika isi array diubah menjadi 5.0, 12867, 7.5, 2000000 yang terjadi adalah Program akan error untuk 5.0 dan 7.5, karena array bilangan bertipe int atau bilangan bulat, sedangkan 5.0 dan 7.5 termasuk double yang merupakan bilangan pecahan.Sedangkan untuk 12867 dan 2000000 tidak error karena masih termasuk bilangan bulat dalam jangkauan tipe int.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut
for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }
Apa keluaran dari program? Jelaskan maksud dari statement tersebut
Jawab:Ketika program dijalankan maka hasilnya adalah: 5
                                                      13
                                                      -7
                                                      17
Artinya semua nilai yang tersimpan di dalam array bil ditampilkan satu per satu secara berurutan. Jadi statement ini adalah perulangan (looping) yang digunakan untuk menampilkan isi array tanpa menulis System.out.println() berkali-kali.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?
Jawab: Jika kondisi perulangan diubah menjadi i <= 4, maka program akan error dengan pesan“ArrayIndexOutOfBoundsException: 4”, karena array bil hanya memiliki indeks dari 0 sampai 3.Kesalahan ini terjadi karena Java tidak mengizinkan kita mengakses elemen di luar batas array. Jadi saat i bernilai 4, program mencoba membaca elemen ke-5 yang sebenarnya tidak ada.Maka solusi yang benar adalah menggunakan kondisi i < bil.length agar perulangan hanya berjalan sampai indeks terakhir yang valid.

Pertanyaan Percobaan 2:
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab:Tidak ada perubahan pada hasil output program. Program tetap menampilkan daftar nilai mahasiswa dari indeks ke-0 sampai ke-9 seperti sebelumnya.Karena pada dasarnya, kondisi i < 10 dan i < nilaiAkhir.length memiliki arti yang sama — keduanya membatasi perulangan agar berjalan sebanyak 10 kali.
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? 
Jawab:Kondisi i < nilaiAkhir.length digunakan di dalam perulangan for untuk mengontrol berapa kali perulangan dilakukan, yaitu sebanyak jumlah elemen yang ada di dalam array.
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
> 70):
for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
        }
Jalankan program dan jelaskan alur program!
Jawab: 1.Program membuat array nilaiAkhir untuk menyimpan nilai semua mahasiswa.
       2.Nilai dimasukkan melalui perulangan pertama (for).
       3.Setelah semua nilai tersimpan, perulangan kedua digunakan untuk memeriksa setiap nilai.
       4.Jika nilai mahasiswa lebih dari 70, program menampilkan bahwa mahasiswa tersebut lulus.
       5.Mahasiswa yang nilainya 70 ke bawah tidak muncul di output.
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut: