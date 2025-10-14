package pertemuan09;

import java.util.Set;
import java.util.HashSet;

public class ContohSet {
    public static void main(String []args) {
        Set<String> temans = new HashSet<String>();

        temans.add("Budi");
        temans.add("Rudi");
        temans.add("Ali");

        System.out.println(temans.toString());

        temans.add("Budi");
        temans.add("Susi");
        System.out.println(temans.toString());

        for (String t: temans) {
            System.out.println(t);
        }
    }
}
