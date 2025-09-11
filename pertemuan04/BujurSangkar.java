public class BujurSangkar extends Bangun2D {
   private double sisi; 

   public BujurSangkar(double sisi) {
    this.sisi = sisi;
   }

   public double getSisi() {
    return sisi;
   }

   public void setSisi(double sisi) {
    this.sisi = sisi;
   }

   // overriding
   public double getLuas() {
    return sisi * sisi;
   }

   public double getKeliling() {
    return 4 * sisi;
   }

   public static void main(String []args) {
    BujurSangkar b = new BujurSangkar(5.0);

    System.out.println("Luas: " + b.getLuas());
    System.out.println("Keliling: " + b.getKeliling());
   }
}
