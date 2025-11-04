package pertemuan11;

public class CelciusFahrenheitMapper implements Mapper<Double,Double> {

    @Override
    public Double konversi(Double input) {
        return input * (9/5) + 32;
    }
    
}
