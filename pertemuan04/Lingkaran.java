public class Lingkaran extends Bangun2D {
    private double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getDiameter() {
        return 2 * r;
    }

    @Override
    public double getKeliling() {
        return 3.14 * getDiameter();
    }

    @Override
    public double getLuas() {
        return 3.14 * r * r;
    }

    
}
