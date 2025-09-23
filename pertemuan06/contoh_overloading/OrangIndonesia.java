package pertemuan06.contoh_overloading;

public class OrangIndonesia extends Orang {
    public OrangIndonesia(String nama) {
        super(nama);
    }

    // overriding
    public void sapa(Orang lain) {
        System.out.println("Hi, " + lain.getNama());
    }

    // overloading (tipe parameter)
    public void sapa(OrangIndonesia lain) {
        System.out.println("Selamat pagi, " + lain.getNama());
    }

    // overloading (tipe parameter)
    public void sapa(OrangInggris lain) {
        System.out.println("Good morning, " + lain.getNama());
    }

    // overloading (jumlah parameter)
    public void sapa(Orang lain, String panggilan) {
        System.out.println("Hi " + panggilan + " " + lain.getNama());
    }
}
