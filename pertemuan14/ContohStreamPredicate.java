import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContohStreamPredicate {
   public static void main(String []args) {
        List<Integer> a = Arrays.asList(7, 10, 3, 4, 5, 8, 6, 2, 1, 9);

        /*Stream<Integer> streamGenap = a.stream().filter(
            new Predicate<>() {
                public boolean test(Integer i) {
                    return i % 2 == 0;
                }
            }
        );*/

        Stream<Integer> streamGenap = a.stream().filter((Integer i) -> i % 2== 0);

        List<Integer> genap = streamGenap.collect(Collectors.toList());

        System.out.println(genap);

        /*
         * List<Integer> genap = a.stream().filter((Integer i) -> i %2 == 0)
         *  .collect(Collectors.toList());
         */
   } 
}
