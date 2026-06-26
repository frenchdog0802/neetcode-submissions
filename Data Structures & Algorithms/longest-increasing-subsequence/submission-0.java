class Solution {
    int max =0;
    public int lengthOfLIS(int[] nums) {
        Map<String , Integer> map = new HashMap<>();
        helper(nums , 0 , -1001 , 0 , map);
        return max;
    }

    private void helper(int[] nums , int index  , int num , int total ,Map<String , Integer> map ){
        if(index == nums.length){
            return ;
        }
        String key = index + "," + num;
        if(map.get(key)!=null && map.get(key) >= total){
            return ;
        }
        map.put(key , total);

        for (int i=index;i<nums.length;i++){
            if(nums[i] > num){
                max = Math.max(max , total+1);
                helper(nums, i+1 , nums[i], total+1 , map);
            }
            
        }
    }
}
