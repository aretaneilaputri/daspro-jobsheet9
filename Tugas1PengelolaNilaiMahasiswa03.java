import java.util.Scanner;

public class Tugas1PengelolaNilaiMahasiswa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilai = new int[jumlahMahasiswa];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlahMahasiswa;

        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n=== HASIL PENGOLAHAN NILAI MAHASISWA ===");
        System.out.println("Nilai rata-rata  : " + rataRata);
        System.out.println("Nilai tertinggi  : " + tertinggi);
        System.out.println("Nilai terendah   : " + terendah);

        System.out.print("Semua nilai mahasiswa: ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}
