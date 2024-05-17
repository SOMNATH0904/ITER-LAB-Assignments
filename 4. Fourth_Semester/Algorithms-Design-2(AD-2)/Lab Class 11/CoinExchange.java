/**
 * Ques 1 : Write a Java Program to implement Coin Exchange.
 */

/**
 * ALGORITHM
 * 
 function coinChange(coins, amount):
    dp = ARRAY of size (amount + 1)
    dp[0] = 1
    for each coin in coins:
        for i from coin to amount:
            dp[i] = dp[i] + dp[i - coin]
    return dp[amount]
 */

/**
 * CODE
 */

public class CoinExchange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 12;

        int ways = coinChange(coins, amount);
        System.out.println("Number of ways to make change for "+amount+" is : "+ways);
    }
}

/**
 * OUTPUT
 *
 * Number of ways to make change for 12 is : 13
 */