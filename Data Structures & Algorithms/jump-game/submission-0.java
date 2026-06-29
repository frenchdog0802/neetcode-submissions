class Solution {
    Map<String , Integer> dp = new HashMap<>();
    public boolean canJump(int[] nums) {
        return dfs(nums , 0);
    }

    private boolean dfs(int[] nums , int index){
        if (nums.length-1== index){
            return true;
        }

        if (index >= nums.length || nums[index] == 0) {
            return false;
        }

        for(int i = nums[index]; i >= 1; i--){
            boolean result = dfs(nums , index+i);
            if(result){
                return true;
            }
        }
        return false;
    }
}
