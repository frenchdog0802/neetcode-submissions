class Solution:
    # def maxProfit(self, prices: List[int]) -> int:
    #     maxNum = 0
    #     for i in range(len(prices)) : 
    #         buy = prices[i]
    #         for j in range(i+1,len(prices)):
    #             sell = prices[j]
    #             maxNum = max(maxNum , sell-buy)

    def maxProfit(self, prices:List[int])-> int:
        l , r = 0,1
        maxNum =0
        while r > l:
            if r > len(prices)-1:
                break
            if prices[r] > prices[l]:
                maxNum = max(maxNum , prices[r]-prices[l])
                r+=1
            else:
                l = r
                r+=1

        return maxNum


            

        
        