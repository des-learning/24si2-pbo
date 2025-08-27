public class Barang {
    // attribute
    String nama;
    int hargaSatuan;
    double ppn = 0.11;

    // constructor
    Barang(String nama, int hargaSatuan)
    {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
    }

    // method
    double jual(int banyak) {
        return this.hargaSatuan * banyak + (this.hargaSatuan * banyak * this.ppn);
    }

    public static void main(String []args) {
        Barang b = new Barang("Pena", 5000);

        System.out.println(b.jual(10));
    }
}
