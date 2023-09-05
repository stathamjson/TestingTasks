package LeedCode.Dynamic_Programming_I;

import java.util.*;

public class _322_Coin_Change {
    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        System.out.println(coinChange(coins, amount));
        System.out.println(coinChange1(coins, amount));

    }

    static int coinChange1(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        int[] calculations = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {

            calculations[i] = amount + 1;
            for (int coin :
                    coins) {
                if (coin <= i) {
                    calculations[i] = Math.min(calculations[i], 1 + calculations[i - coin]);
                }
            }
        }

        return calculations[amount] > amount ? -1 : calculations[amount];
    }

    static int coinChange(int[] coins, int amount) {

        int[] calculations = new int[amount + 1];
        for (int i = 0; i < calculations.length; i++) {
            calculations[i] = helper(coins, i, calculations);
        }
        return calculations[calculations.length - 1];
    }

    static int helper(int[] coins, int amountToChoose, int[] calculations) {
        if (amountToChoose == 0) {
            return 0;
        }
        List<Integer> coinsNumber = new ArrayList<>(coins.length);
        for (int i = 0; i < coins.length; i++) {
            if (amountToChoose / coins[i] > 0) {
                int remainder = amountToChoose - coins[i];
                if (calculations[remainder] != -1) {
                    coinsNumber.add(1 + calculations[remainder]);
                }
            }
        }
        return coinsNumber.stream()
                .min(Comparator.naturalOrder()).orElse(-1);
    }
}
