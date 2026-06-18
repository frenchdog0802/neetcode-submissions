class Solution {
    int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        Map<String,Integer> memo = new HashMap<>();
        helper(coins,amount, 0 , 0 , 0,memo);
        return min== Integer.MAX_VALUE ? -1 : min;
    }

    private void helper(int[] coins, int amount , int index , int total , int count , Map<String,Integer> memo){
        if(total>amount){
            return ;
        }
        if(total == amount){  
            min = Math.min(count , min);
            return;
        }
        String key = index + "," + total;

        if(memo.containsKey(key) && memo.get(key) <= count){
            return;
        }

        memo.put(key,count);

        for (int i=index;i<coins.length ;i++){
            helper(coins , amount , i , total + coins[i] , count+1 , memo);
        }
    }
}
