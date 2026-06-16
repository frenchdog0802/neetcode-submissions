class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      
      
      List<List<Integer>> result = new ArrayList<>();

      for (int i =0 ; i<nums.length;i++){
         if(i !=0 && nums[i] == nums[i-1]){
            continue;
         }
        
        int left = i+1;
        int right =i+2;
         while(left <= nums.length-2){
            List<Integer> array = new ArrayList<>();
            if(nums[i]+ nums[left] + nums[right] == 0){
                array.add(nums[i]);
                array.add(nums[left]);
                array.add(nums[right]);
            }

            while( right < nums.length-1 && nums[right] == nums[right+1]){
                right++;
            }

            while(nums[left] == nums[left+1]&& left < nums.length-2){
                left++;
            }
            right++;
            if (right==nums.length){
                left ++;
                right = left+1;
            }
             if(!array.isEmpty()){
                result.add(array);
            }
         }
           
         
      }

      return result;
    }
}
