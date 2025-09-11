package RumahSakit;

import java.util.Scanner;

public class RumahSakit {
    public Pasien registrasi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor Identitas: ");
        String noIdentitas = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.println("In Pasien (Y/T): ");
        if (input.nextLine().toUpperCase().equals("Y")) {
            System.out.print("No Kamar: ");
            String noKamar = input.nextLine();

            return new InPasien(noIdentitas, nama, jenisKelamin, noKamar);
        }

        return new OutPasien(noIdentitas, nama, jenisKelamin);
    }

    public static void main(String []args) {
        RumahSakit rs = new RumahSakit();

        Pasien pasien = rs.registrasi();
        System.out.println(pasien);
    }
}
