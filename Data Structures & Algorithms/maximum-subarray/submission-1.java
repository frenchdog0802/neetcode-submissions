class Solution {
    Map<String , Integer> map = new HashMap<>();
    public int maxSubArray(int[] nums) {
        return helper(nums , 0 , 0);
    }

    private int helper(int[] nums , int status , int index){

        if(index == nums.length){
            return (status == 0) ? Integer.MIN_VALUE : 0;
        }

        // 
        String key = status+ "," + index;
        if(map.get(key)!=null){
            return map.get(key);
        }

        int res = 0;


        // status 0
        if(status ==0){
            // keep going
            int keepwaiting = helper(nums , 0 , index+1);
            // start now
            int startNow  = helper(nums , 1 , index+1) + nums[index];
            res = Math.max(keepwaiting , startNow);
        }

        // status 1  ready stop
        else if(status ==1){
            // keep going
            int keepwaiting = helper(nums , 1 , index+1) + nums[index];
            // ready to stop
            int stopNow =  helper(nums , 2 , index+1) ;
            res = Math.max(keepwaiting , stopNow);
        }

        // status 2 stop
        else if(status ==2){
            res = helper(nums , 2 , index+1);
        }

        map.put(key , res);
        return res;
        
    }
}
