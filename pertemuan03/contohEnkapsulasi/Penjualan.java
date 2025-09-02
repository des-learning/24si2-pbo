package contohEnkapsulasi;

public class Penjualan {
    private ItemJual []items;
    private int banyakItem;
    private int itemTerisi = 0;

    public Penjualan(int banyakItem) {
        this.items = new ItemJual[banyakItem];
        this.banyakItem = banyakItem;
    }

    public void addItem(Barang barang, int banyak) {
        if (this.itemTerisi >= this.banyakItem) {
            return;
        }

        this.items[this.itemTerisi] = new ItemJual(barang, banyak);
        this.itemTerisi++;
    }

    public void removeItem() {
        if (this.itemTerisi <= 0) {
            return;
        }

        this.itemTerisi--;
    }

    public double hitungTotalJual(Pajak pajak)
    {
        double totalJual = 0.0;

        for (ItemJual item: items) {
            totalJual += item.subTotal() + pajak.hitungPajak(item.subTotal());
        }

        return totalJual;
    }

    public static void main(String []args) {
        Penjualan j = new Penjualan(3);

        j.addItem(new Barang("Buku", 1000), 3);
        j.addItem(new Barang("Pena", 1500), 4);
        j.addItem(new Barang("Penghapus", 500), 10);

        Pajak ppn = new Pajak(0.11);

        System.out.println(j.hitungTotalJual(ppn));
    }
}

final class ItemJual {
    private Barang barang;
    private int banyak;
    public ItemJual(Barang barang, int banyak) {
        this.barang = barang;
        this.banyak = banyak;
    }
    public Barang getBarang() {
        return barang;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public int getBanyak() {
        return banyak;
    }
    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
    public double subTotal() {
        return this.barang.getHargaSatuan() * this.banyak;
    }
}