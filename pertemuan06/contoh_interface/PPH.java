package pertemuan06.contoh_interface;

public class PPH implements Taxable {
    private double penghasilan;

    public PPH(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    @Override
    public double calculateTax(double baseAmount) {
        return this.getRate() * penghasilan;
    }

    @Override
    public double getRate() {
        if (penghasilan <= 60000000) {
            return 0.05;
        } else {
            return 0.10;
        }
    }

    public double getPenghasilan() {
        return penghasilan;
    }
}
