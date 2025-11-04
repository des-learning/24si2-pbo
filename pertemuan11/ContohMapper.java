package pertemuan11;

import java.util.Scanner;

public class ContohMapper {
   public static void main(String []args) {
    /*Mapper c = new NilaiAngkaNilaiMapper();

    System.out.println("Nilai Huruf: " + c.konversi(100.0));

    Mapper d = new CelciusFahrenheitMapper();

    System.out.println("Fahrenheit: " + d.konversi(36.0));*/
    //Mapper mapper = new NilaiAngkaNilaiMapper();
    Mapper mapper = new CelciusFahrenheitMapper();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input nilai: ");
    double nilaiAngka = scanner.nextDouble();

    System.out.println("Hasil: " + mapper.konversi(nilaiAngka));
   } 
}
