package simple.dp;

import java.util.ArrayList;
import java.util.List;

public class ClimbStairs {

    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        int[] dpList = new int[n + 1];
        dpList[1] = 1;
        dpList[2] = 2;

        for (int i = 3; i <= n; i++) {
            dpList[i] = dpList[i - 1] + dpList[i - 2];
        }

        return dpList[n];
    }

    public static void main(String[] args) {

        int dp = climbStairs(5);

        System.out.println(dp);
    }

}
