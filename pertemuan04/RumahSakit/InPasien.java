package RumahSakit;

public class InPasien extends Pasien {
    private String noKamar;

   public InPasien(
    String noIdentitas, 
    String nama, 
    String jenisKelamin, 
    String noKamar
    ) {
        super(noIdentitas, nama, jenisKelamin);
        this.noKamar = noKamar;
    } 
}
