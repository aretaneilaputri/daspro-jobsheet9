
import java.util.Scanner;

public class Tugas3PencarianMenuKafe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ditemukan = true;
                posisi = i;
                break; 
            }
        }

        System.out.println("\n=== HASIL PENCARIAN ===");
        if (ditemukan) {
            System.out.println("Menu \"" + cari + "\" tersedia di kafe (posisi ke-" + (posisi + 1) + ").");
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia di kafe.");
        }
    }
}
