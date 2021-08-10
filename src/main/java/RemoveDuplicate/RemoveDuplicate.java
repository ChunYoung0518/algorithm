package RemoveDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static int[] removeDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int n : a) {
            set.add(n);
        }

        int[] res = new int[set.size()];
        int i = 0;
        for (Integer n : set) {
            res[i++] = n;
        }

        return res;
    }
}
