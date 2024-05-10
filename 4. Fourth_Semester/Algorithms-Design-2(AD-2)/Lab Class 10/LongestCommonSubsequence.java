/**
 * Ques 2 : Write a Java Program of Longest Common Subsequence.
 */

/**
 * ALGORITHM
 * 
Function lcsLength(s1, s2):
    m = length of s1
    n = length of s2
    dp[m+1][n+1]

    for i = 0 to m:
        for j = 0 to n:
            if i == 0 or j == 0:
                dp[i][j] = 0
            else if s1[i-1] == s2[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])

    return dp[m][n]
 *
 */

/**
 * CODE
 */

public class LongestCommonSubsequence {
    public static int lcsLength(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int lcsLength = lcsLength(s1, s2);
        System.out.println("Length of LCS(Longest Common Subsequence) is : "+lcsLength);
    }
}

/**
 * OUTPUT
 * 
 * Length of LCS(Longest Common Subsequence) is : 4
 */