class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean res = false;
        for (int i =0 ; i < nums.length ; i++){
            if(map.get(nums[i])!=null){
                res=true ;
            }else {
                map.put(nums[i],1);
            }
        };

        return res;
    }
}