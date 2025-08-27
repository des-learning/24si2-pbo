class PersegiPanjang {
    // atribute
    int panjang;
    int lebar;

    // constructor
    //<return type> <nama fungsi>(type parameter1, type paramter2,...)
    PersegiPanjang(int p, int l)
    {
        this.panjang = p;
        this.lebar = l;
    }

    int hitungLuas() {
        return this.panjang * this.lebar;
    }

    public static void main(String []args)
    {
        PersegiPanjang p1 = new PersegiPanjang(10, 2);
        System.out.println("Panjang: " + p1.panjang);
        System.out.println("Lebar: " + p1.lebar);
        System.out.println("Luas: " + p1.hitungLuas());
    }
}