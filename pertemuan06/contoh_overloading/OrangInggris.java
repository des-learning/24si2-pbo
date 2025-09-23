package pertemuan06.contoh_overloading;

public class OrangInggris extends Orang {
    public OrangInggris(String nama) {
        super(nama);
    }

    @Override
    public void sapa(Orang lain) {
        System.out.println("Hello, " + lain.getNama());
    }
}
