/**
 * Ques 2 : Write a Java Program to implement Matrix Chain Multiplication.
 */

/**
 * ALGORITHM
 * 
function matrixChainOrder(p):
    n = length(p) - 1
    dp = array of size [n][n]

    for i from 0 TO n-1:
        dp[i][i] = 0

    for length from 2 TO n:
        for i from 0 TO n - length:
            j = i + length - 1
            dp[i][j] = infinity
            for k from i TO j-1:
                cost = dp[i][k] + dp[k+1][j] + p[i] * p[k+1] * p[j+1]
                if cost < dp[i][j]:
                    dp[i][j] = cost

    return dp[0][n-1]
 */

public class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] p) {
        int n = p.length - 1;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        for(int length = 2; length <= n; length++) {
            for(int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] p = {1, 2, 3, 4};
        int minCost = matrixChainOrder(p);
        System.out.println("Minimum number of multiplications is : "+minCost);
    }
}

/**
 * OUTPUT
 *
 * Minimum number of multiplications is : 18
 */