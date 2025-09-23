package pertemuan06.contoh_abstract;

public class PersegiPanjang extends Bangun2D {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * panjang + 2 * lebar;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }


}
