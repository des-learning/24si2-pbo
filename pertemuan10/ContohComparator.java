import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ContohComparator {
    public static void main(String []args) {
        List<Integer> a = new LinkedList<>();

        a.add(10);
        a.add(5);
        a.add(2);
        a.add(7);
        a.add(8);
        a.add(4);

        System.out.println("Sebelum diurutkan");
        for (Integer i: a) {
            System.out.println(i);
        }

        Collections.sort(a);
        System.out.println("Setelah diurutkan (Natural order)");
        for (Integer i: a) {
            System.out.println(i);
        }

        Collections.sort(a, new GenapGanjilComparator());
        System.out.println("Setelah diurutkan (yang genap duluan baru ganjil)");
        for (Integer i: a) {
            System.out.println(i);
        }
    }
}
