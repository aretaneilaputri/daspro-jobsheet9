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

