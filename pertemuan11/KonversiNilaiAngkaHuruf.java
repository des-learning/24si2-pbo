package pertemuan11;

public class KonversiNilaiAngkaHuruf {
    public char konversi(double nilai) {
        if (nilai >= 80.0) {
            return 'A';
        }
        if (nilai >= 70.0) {
            return 'B';
        }
        if (nilai >= 60.0) {
            return 'C';
        }
        if (nilai >= 50.0) {
            return 'D';
        }

        return 'E';
    }

    public static void main(String []args) {
        double nilaiAngka = 75.0;

        char nilaiHuruf = (new KonversiNilaiAngkaHuruf()).konversi(nilaiAngka);

        System.out.println("Nilai angka: " + nilaiAngka);
        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
