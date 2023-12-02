package dp.knapsack;

import java.util.Arrays;

public class recursive {

    public static void main(String[] args) {

        int[] item = new int[]{2, 4, 1, 9, 3};
        int[] val = new int[]{10, 2, 2, 3, 1};

        int tCap = 2;

        int[][] dp = new int[item.length +1][tCap+1];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }

        int profit = knapsack(dp, item, val, tCap, item.length);
        System.out.println(profit);
    }

    public static int knapsack(int[][] dp, int[] item, int[] val, int tCap, int size) {

        if (size == 0 || tCap == 0) return 0;

        if (dp[size][0] != -1) return dp[size][tCap];

        if (tCap >= item[size - 1]) {

            dp[size][tCap] = Math.max( val[size - 1] + knapsack(dp, item, val, tCap - item[size - 1], size - 1),
                    knapsack(dp, item, val, tCap, size - 1)
            );
        } else {
            dp[size][tCap] = knapsack(dp, item, val, tCap, size - 1);
        }

        return dp[size][tCap];
    }
}
