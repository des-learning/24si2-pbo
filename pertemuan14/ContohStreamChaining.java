import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ContohStreamChaining {
   public static void main(String []args) {
        List<Integer> a = Arrays.asList(7, 10, 3, 4, 5, 8, 6, 2, 1, 9);

        // tampilkan 2 bilangan genap yang lebih besar dari 5
        List<Integer> bilGenapGT5 = a.stream()
            .filter((Integer i) -> i % 2 == 0)
            .filter((Integer i) -> i > 5)
            .limit(2)
            .collect(Collectors.toList());

        System.out.println(bilGenapGT5);

        List<Integer> genap = new LinkedList<>();
        for (Integer i:a) {
            if (i % 2 == 0) {
                genap.add(i);
            }
        }
        List<Integer> lebihBesar5 = new LinkedList<>();
        for (Integer i: genap) {
            if (i > 5) {
                lebihBesar5.add(i);
            }
        }

        List<Integer> ambil2Item = new LinkedList<>();
        ambil2Item.add(lebihBesar5.get(0));
        ambil2Item.add(lebihBesar5.get(1));
        System.out.println(ambil2Item);

   } 
}
