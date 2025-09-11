public class ContohPolymorphism {
    public static void main(String []args) {
        // array of bangun2d
        // karena bujur sangkar & lingkaran
        // adalah subclass dari bangun2d
        // maka kita bisa perlakukan bujur sangkar & lingkaran
        // sebagai bangun2d
        Bangun2D []bangun = {
            new BujurSangkar(5.0),
            new Lingkaran(10.0),
        };

        for (Bangun2D b: bangun) {
            System.out.println(b.getClass().getName());
            System.out.println("Luas: " + b.getLuas());
            System.out.println("Keliling: " + b.getKeliling());
        }
    }
}
