class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxNum = 0
        for i in range(len(prices)) : 
            buy = prices[i]
            for j in range(i+1,len(prices)):
                sell = prices[j]
                maxNum = max(maxNum , sell-buy)

        return maxNum


            

        
        