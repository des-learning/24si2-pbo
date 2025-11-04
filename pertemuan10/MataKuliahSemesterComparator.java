import java.util.Comparator;

public class MataKuliahSemesterComparator implements Comparator<MataKuliah> {

    @Override
    public int compare(MataKuliah o1, MataKuliah o2) {
        int compareSemester = ((Integer)o1.getSemester())
            .compareTo((Integer)o2.getSemester());

        if (compareSemester == 0) {
            return o1.getNama().compareTo(o2.getNama());
        }

        return compareSemester;
    }
    // implementasikan sebuah comparator dari mata kuliah
    // yang mengurutkan matakuliah berdasarkan semesternya
    // dan namanya
    // misalnya ada list mata kuliah:
    // A, 3 SKS, semester 3
    // B, 3 SKS, semester 2
    // C, 3 SKS, semester 1
    // D, 3 SKS, semester 3
    // hasil pengurutan menggunakan comparator ini:
    // C, 3 SKS, semester 1
    // B, 3 SKS, semester 2
    // A, 3 SKS, semester 3
    // D, 3 SKS, semester 3

}
