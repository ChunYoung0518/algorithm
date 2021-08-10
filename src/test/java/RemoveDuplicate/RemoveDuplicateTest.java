package RemoveDuplicate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicateTest {

    @Test
    public void test1() {
        int[] a = {1, 3, 5, 7, 9, 5, 8, 9};
        int[] res = RemoveDuplicate.removeDuplicates(a);
        System.out.println(Arrays.toString(res));
    }

}