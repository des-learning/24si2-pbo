package pertemuan06.contoh_overloading;

public class ContohOverloading {
    public static void main(String []args) {
        OrangIndonesia budi = new OrangIndonesia("budi");
        OrangIndonesia adi = new OrangIndonesia("adi");
        OrangInggris steven = new OrangInggris("steven");

        budi.sapa(adi);
        budi.sapa(steven);
        steven.sapa(budi);
        // supercasting
        budi.sapa((Orang) steven);
        budi.sapa(adi, "Pak");
    }
}
