public class ContohBarang {
    public static void main(String []args) {
        // caller site/usage
        Barang b = new Barang("Pena", 1000);
        //b.hargaSatuan = -1000;
        b.setHargaSatuan(2000);
        //b.setHargaSatuan(-2000);
        char a = 'a';
        a = 'b';
        int n = 10;
        Integer N = 10;

        System.out.println("Harga satuan: " + b.getHargaSatuan());
        System.out.println(b.jual(10));
    }
}
