class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 1;
        int[] result = null;
        
        while (left<right ){
            if(nums[left] + nums[right] == target){
                result = new int[]{left,right}; 
            }

            if(left==nums.length-2 && right == nums.length-1){
                break;
            }
            right++;
            if(right==nums.length){
                left++;
                right = left+1;
            };
        }

        return result;
    }
}
