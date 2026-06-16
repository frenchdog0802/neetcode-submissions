class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }


        int house1 = nums[0];
        int house2 = Math.max(house1 , nums[1]);

        for (int i=2;i<nums.length;i++){
           int current = Math.max(house2 , nums[i] + house1);
           house1 = house2;
           house2 = current;
        }
        return Math.max(house1, house2);
    }
}
