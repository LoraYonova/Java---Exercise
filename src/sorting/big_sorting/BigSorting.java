package sorting.big_sorting;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {

        return unsorted.stream().sorted((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return new BigInteger(o1).compareTo(new BigInteger(o2));
            }
            return  o1.length() - o2.length();
        }).collect(Collectors.toList());

    }
}
