package pertemuan11;

public class KonversiCelciusFahrenheit {
    public double konversi(double celcius) {
        return celcius * (9/5) + 32;
    }

    public static void main(String []args) {
        double celcius = 36;

        double fahrenheit = (new KonversiCelciusFahrenheit()).konversi(celcius);

        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
