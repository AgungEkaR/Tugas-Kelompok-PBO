
/**
 * Write a description of class Inventory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Integer> itemMap; 
    private int totalItem;

    public Inventory() {
        itemMap = new HashMap<>();
        totalItem = 45;
        
        itemMap.put("Kunci Inggris", 5);
        itemMap.put("Obeng", 10);
        itemMap.put("Tang", 7);
        itemMap.put("Ban Cadangan", 3); 
        itemMap.put("Oli Mesin", 20);
    }

    @Override
    public void tambahItem(String item, int jumlah) {
        if (jumlah <= 0) {
            System.out.println("\nJumlah harus lebih besar dari 0.");
            return;
        }
        itemMap.put(item, itemMap.getOrDefault(item, 0) + jumlah);
        totalItem += jumlah;
        System.out.println("Ditambahkan: " + jumlah + " " + item);
    }

    public void hapusItem(String item, int jumlah) {
        if (itemMap.containsKey(item)) {
            int currentQuantity = itemMap.get(item);
            if (jumlah <= 0) {
                System.out.println("\nJumlah harus lebih besar dari 0.");
                return;
            }
            if (jumlah >= currentQuantity) {
                totalItem -= currentQuantity;
                itemMap.remove(item);
                System.out.println("Item " + item + " telah dihapus sepenuhnya.");
            } else {
                itemMap.put(item, currentQuantity - jumlah);
                totalItem -= jumlah;
                System.out.println("Dihapus: " + jumlah + " " + item + "(s)");
            }
        } else {
            System.out.println("\nItem tidak ditemukan.");
        }
    }

    @Override
    public void tampilkanItem() {
        if (itemMap.isEmpty()) {
            System.out.println("\nInventaris kosong.");
            return;
        }
        System.out.println("\nDaftar Item dalam Inventaris:");
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nTotal item: " + totalItem);
    }
}


