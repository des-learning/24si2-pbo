import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ContohStream {
    public static void main(String []args) {
        List<Integer> a = Arrays.asList(7, 10, 3, 4, 5, 8, 6, 2, 1, 9);

        List<Integer> genap = new LinkedList<>();
        List<Integer> ganjil = new LinkedList<>();

        /*for (Integer i: a) {
            if (i % 2 == 0) {
                genap.add(i);
            } else {
                ganjil.add(i);
            }
        }*/

        // stream dengan anonymous class
        /* a.stream().forEach(
            new Consumer<>() {
                public void accept(Integer i) {
                    if (i % 2 == 0) {
                        genap.add(i);
                    } else {
                        ganjil.add(i);
                    }
                }
            }
        ); */

        // stream dengan anonymous function/lambda expression
        a.stream().forEach((Integer i) -> {
            if (i % 2 == 0) {
                genap.add(i);
            } else {
                ganjil.add(i);
            }
        });

        System.out.println(ganjil);
        System.out.println(genap);
    }
}