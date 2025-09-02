package contohEnkapsulasi;

public class Pajak {
    private double tarif;

    public Pajak(double tarif) {
        this.tarif = tarif;
    }
    
    private void setTarif(double tarif) {
        if (tarif < 0.0) {
            throw new IllegalArgumentException("Tarif salah");
        }

        this.tarif = tarif;
    }

    public double getTarif() {
        return tarif;
    }

    public double hitungPajak(double nilaiPengenaanPajak) {
        return this.tarif * nilaiPengenaanPajak;
    }
}
