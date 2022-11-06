package simple.dp;

public class DpTest {

    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};

        int w = 50; //袋子的容积
        int n = 3; //物品的个数

        int dp[][] = new int[n + 1][w + 1];// 存每个状态下的最优解

        for (int i = 1; i <= n; i++) { //表示每次加第几个物品进来
            for (int cw = 1; cw <= w; cw++) { //表示袋子在cw这个容积的时候所能保存的最大价值
                if (weight[i - 1] <= cw) { // 表示这个物品在cw容积的时候能不能加
                    dp[i][cw] = Math.max(
                            value[i - 1] + dp[i - 1][cw - weight[i - 1]], //表示装这个物品
                            dp[i - 1][cw]  //表示不装，取亮着最大就可
                    );
                } else {
                    dp[i][cw] = dp[i - 1][cw]; //这个因为装不下，所以就是之前一个存的
                }
            }
        }

        // 算完以后，只需要输出矩阵最后一个即可
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                System.out.println("矩阵，" + i + "行：" + j + "列：" + dp[i][j]);
            }
        }
        System.out.println("能装的最大价值为：" + dp[n][w]);

    }
}
