package pertemuan09;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ContohList {
    public static void main(String []args) {
        // List<Integer> nilai = new ArrayList<Integer>();
        List<Integer> nilai = new LinkedList<Integer>();

        nilai.add(10);
        nilai.add(7);
        nilai.add(5);
        nilai.add(9);

        System.out.println(nilai.toString());

        // akses data ke 0
        System.out.println(nilai.get(0)); // 10
        // akses data ke 3
        System.out.println(nilai.get(3)); // 9

        // menghapus item 5
        nilai.remove((Integer) 5);
        System.out.println(nilai.toString());

        // menghapus index 0
        nilai.remove(0);
        System.out.println(nilai.toString());

        // apakah ada data 7 di dalam list
        System.out.println(nilai.contains(7));

        // posisi index data 7 di dalam list
        System.out.println(nilai.indexOf(7));
    }
}
