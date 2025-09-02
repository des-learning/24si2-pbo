package contohEnkapsulasi;

public class Barang {
    private String nama;
    private double hargaSatuan;

    public Barang(String nama, double hargaSatuan) {
        this.nama = nama;
        this.setHargaSatuan(hargaSatuan);
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    private void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan < 0) {
            throw new IllegalArgumentException("Harga satuan salah");
        }

        this.hargaSatuan = hargaSatuan;
    }
}
