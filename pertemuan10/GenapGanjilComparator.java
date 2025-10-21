import java.util.Comparator;

public class GenapGanjilComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        int modulusO1 = o1 % 2;
        int modulusO2 = o2 % 2;

        if (modulusO1 == modulusO2) {
            return o1.compareTo(o2);
        }

        return modulusO1 - modulusO2;
    }
}
