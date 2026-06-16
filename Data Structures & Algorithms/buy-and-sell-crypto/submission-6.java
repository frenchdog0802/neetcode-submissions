class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int right =left+1;
        int maxprofit=0;

        while(left<=prices.length-2){
            int profit = prices[right] - prices[left]; 
            if( profit > maxprofit){
                    maxprofit = profit;
            }
            right++;
            if(right==prices.length){
                left++;
                right = left+1;
            }

        }

        return maxprofit;
    }
}
