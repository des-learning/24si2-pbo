import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ContohComparable {
   public static void main(String []args) {
    List<MataKuliah> matakuliah = new LinkedList<MataKuliah>();

    matakuliah.add(new MataKuliah("A", "A", 4, 3));
    matakuliah.add(new MataKuliah("B", "B", 3, 1));
    matakuliah.add(new MataKuliah("D", "D", 2, 1));
    matakuliah.add(new MataKuliah("C", "C", 2, 3));
    matakuliah.add(new MataKuliah("E", "E", 3, 2));
    matakuliah.add(new MataKuliah("F", "F", 4, 2));

    System.out.println("Mata kuliah sebelum di urutkan");
    for (MataKuliah m: matakuliah) {
        System.out.println(m.toString());
    }

    System.out.println("Mata kuliah setelah di urutkan");
    Collections.sort(matakuliah);
    for (MataKuliah m: matakuliah) {
        System.out.println(m.toString());
    }

    // panggil sort mata kuliah dengan menggunakan MataKuliahSemesterComparator
   } 
}
