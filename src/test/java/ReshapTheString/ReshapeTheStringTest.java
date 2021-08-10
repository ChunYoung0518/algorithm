package ReshapTheString;

import org.junit.jupiter.api.Test;

class ReshapeTheStringTest {

    @Test
    public void test1() {
        String res = ReshapeTheString.reshape(2, "a    b c d e f g");
        System.out.println(res);
    }

    @Test
    public void test2() {
        String res = ReshapeTheString.reshape(3, "abcd ef ghi jh");
        System.out.println(res);
    }

}