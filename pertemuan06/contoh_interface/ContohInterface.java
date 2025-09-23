package pertemuan06.contoh_interface;

public class ContohInterface {
    public static void main(String []args) {
        Taxable[] pajak = {
            new PPN(),
            new PPH(70000000),
        };

        for (Taxable p: pajak) {
            System.out.println(p.getClass().getName());
            System.out.println("Rate: " + (p.getRate() * 100) + "%");
            System.out.println("Tax: " + p.calculateTax(10000000));
        }
    }
}
