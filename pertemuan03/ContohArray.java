public class ContohArray {
    public static void main(String []args) {
        /*for (String arg: args) {
            System.out.println(arg);
        }*/
        int []nilai = {1, 2, 3, 4, 5};
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
        String []nama = new String[3]; // buat array nilai1 dengan jumlah element 3
        nama[0] = "Budi";
        nama[1] = "Agus";
        nama[2] = "Rudi";
    }
}