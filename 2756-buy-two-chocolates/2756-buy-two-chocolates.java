class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        if((prices[0]+prices[1]) <= money)
            return (money - (prices[0] + prices[1]));
        else
            return money;
    }
}