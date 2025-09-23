package pertemuan06.contoh_interface;

public class PPN implements Taxable {

    @Override
    public double calculateTax(double baseAmount) {
        return getRate() * baseAmount;
    }

    @Override
    public double getRate() {
        return 0.11;
    }

}
