package AccountBalanceAtTheEndOfYear;

import org.junit.jupiter.api.Test;

import static AccountBalanceAtTheEndOfYear.AccountBalance.solution;
import static org.junit.jupiter.api.Assertions.*;

class AccountBalanceTest {

    @Test
    public void test1() {
        int[] A = {100, 100, 100};
        String[] D = {"2020-12-31", "2020-12-22", "2020-12-03"};

        assertEquals(240, solution(A, D));
    }

    @Test
    public void test2() {
        int[] A = {180, -50, -25, -25};
        String[] D = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};

        assertEquals(25, solution(A, D));
    }

    @Test
    public void test3() {
        int[] A = {1,-1,0,-105,1};
        String[] D = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14"};

        assertEquals(-164, solution(A, D));
    }

    @Test
    public void test4() {
        int[] A = {100, 100, -10, -20,-30};
        String[] D = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};

        assertEquals(80, solution(A, D));
    }

}