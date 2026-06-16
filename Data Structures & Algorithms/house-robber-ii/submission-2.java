class Solution {
    public int rob(int[] nums) {
                if(nums.length ==0 ){
            return 0;
        } 
        if(nums.length ==1){
            return nums[0];
        }
        int[] group1 = Arrays.copyOfRange(nums , 0  , nums.length-1);
        int[] group2 = Arrays.copyOfRange(nums , 1  , nums.length);
        return Math.max(helper(group1) ,helper(group2));
    }

    private int helper(int[] nums){
        if(nums.length ==0 ){
            return 0;
        } 
        if(nums.length ==1){
            return nums[0];
        }
        int house1 = nums[0];
        int house2 = Math.max(nums[1] , house1); 
        for(int i=2;i<nums.length;i++){
            int current = Math.max(house2 , house1+nums[i]);
            house1 = house2;
            house2 = current;
        }
        return Math.max(house1, house2);
    }
}
