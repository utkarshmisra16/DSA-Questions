class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secm = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                secm = min;
                min = prices[i];
            }     
            else
                secm = Math.min(secm, prices[i]);       
        }
        if(min+secm > money)
            return money;
        else
            return (money-min-secm);
    }
}