package pertemuan11;

public class NilaiAngkaNilaiMapper implements Mapper<Double,Character> {

    @Override
    public Character konversi(Double input) {
        if (input >= 80.0) {
            return 'A';
        }
        if (input >= 70.0) {
            return 'B';
        }
        if (input >= 60.0) {
            return 'C';
        }
        if (input >= 50.0) {
            return 'D';
        }

        return 'E';
    }

}
