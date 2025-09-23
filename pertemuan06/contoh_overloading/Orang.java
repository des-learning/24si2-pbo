package pertemuan06.contoh_overloading;

abstract public class Orang {
    private String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    abstract public void sapa(Orang lain);
}
