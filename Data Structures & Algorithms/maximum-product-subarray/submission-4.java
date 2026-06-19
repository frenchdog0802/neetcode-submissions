class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return  nums[0];
        }
       
        int currentMin = 1;
        int currentMax = 1;
        int arrayMax = 0;
    
        for (int i=0;i< nums.length;i++){
            int tmp = currentMax * nums[i];
            currentMax = Math.max(nums[i] , Math.max(nums[i] * currentMax ,nums[i]*currentMin));
            currentMin = Math.min(nums[i] , Math.min(tmp ,nums[i]*currentMin));
            arrayMax = Math.max(arrayMax, currentMax);
        }

        return arrayMax;
    }
}
