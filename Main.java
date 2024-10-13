
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main {
    public static void main() {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        String pilihan;
        
        do {
            System.out.println("\nSelamat Datang di Toko Perkakas Sinar Abadi");
            System.out.println("Menu:");
            System.out.println("1. Tambah Alat/Suku Cadang");
            System.out.println("2. Hapus Alat/Suku Cadang");
            System.out.println("3. Tampilkan Alat/Suku Cadang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("\nMasukkan nama alat/suku cadang: ");
                    String itemTambah = scanner.nextLine();
                    System.out.print("\nMasukkan jumlah alat/suku cadang: ");
                    int jumlahTambah = Integer.parseInt(scanner.nextLine());
                    inventory.tambahItem(itemTambah, jumlahTambah);
                    break;
                case "2":
                    System.out.print("\nMasukkan nama alat/suku cadang yang ingin dihapus: ");
                    String itemHapus = scanner.nextLine();
                    System.out.print("\nMasukkan jumlah alat/suku cadang yang ingin dihapus: ");
                    int jumlahHapus = Integer.parseInt(scanner.nextLine());
                    inventory.hapusItem(itemHapus, jumlahHapus);
                    break;
                case "3":
                    inventory.tampilkanItem();
                    break;
                case "4":
                    System.out.println("\nKeluar dari program.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        } while (!pilihan.equals("4"));
        
        scanner.close();
    }
}


