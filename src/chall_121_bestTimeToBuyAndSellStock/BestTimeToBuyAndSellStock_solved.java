package chall_121_bestTimeToBuyAndSellStock;

// Input: prices = [3,3,5,0,0,3,1,4]


public class BestTimeToBuyAndSellStock_solved {
    public int maxProfitTest(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            if(min < prices[i]){
                maxDiff = Math.max(maxDiff, prices[i] - min);
            }
        }

        return maxDiff;
    }
}
