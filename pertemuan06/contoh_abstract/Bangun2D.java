package pertemuan06.contoh_abstract;

abstract public class Bangun2D {
    abstract public double getLuas();
    abstract public double getKeliling();
    
    public static void main(String []args) {
        // Bangun2D a = new Bangun2D(); // error tidak bisa buat object dari class abstract
    }
}
