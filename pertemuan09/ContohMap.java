package pertemuan09;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ContohMap {
    public static void main(String []args) {
        Map<String,Integer> nilai = new Hashtable<String,Integer>();

        nilai.put("Budi", 50);
        nilai.put("Agus", 70);
        nilai.put("Rudi", 80);

        System.out.println(nilai.toString());

        System.out.println(nilai.get("Budi"));
        System.out.println(nilai.get("Rudi"));

        nilai.put("Budi", 80);
        System.out.println(nilai.toString());

        for (Map.Entry<String, Integer> i: nilai.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
