public class Barang {
    // attribute
    private String nama;
    private int hargaSatuan;
    private double ppn = 0.11;

    // constructor
    Barang(String nama, int hargaSatuan)
    {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
    }

    // method
    public double jual(int banyak) {
        return this.hargaSatuan * banyak + (this.hargaSatuan * banyak * this.ppn);
    }

    // getter/aksesor
    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    // setter/mutator
    public void setHargaSatuan(int hargaSatuan) {
        if (hargaSatuan < 0) {
            throw new IllegalArgumentException("Harga satuan salah, harus >= 0");
        }

        this.hargaSatuan = hargaSatuan;
    }

    public static void main(String []args) {
        Barang b = new Barang("Pena", 5000);

        System.out.println(b.jual(10));
    }
}
