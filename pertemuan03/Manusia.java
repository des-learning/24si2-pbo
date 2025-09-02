public class Manusia {
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public void sayHello(Manusia other) {
        System.out.println(nama + ": Hello, " + other.nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        // tidak bisa assign nama kosong
        if (nama.isEmpty()) {
            return;
        }

        this.nama = nama;
    }

    public static void main(String []args) {
        Manusia budi = new Manusia("Budi");
        Manusia susi = new Manusia("Susi");

        budi.setNama("");
        budi.sayHello(susi);
        susi.sayHello(budi);

    }
}
