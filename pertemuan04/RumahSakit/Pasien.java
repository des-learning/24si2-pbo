package RumahSakit;

public class Pasien {
    private String noIdentitas;
    private String nama;
    private String jenisKelamin;

    // constructor
    // menginisialisasi object dari class ini
    public Pasien(String noIdentitas, String nama, String jenisKelamin) {
        this.noIdentitas = noIdentitas;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
