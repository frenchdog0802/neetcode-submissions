class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int mid = 1;
        int right = 2;
        List<List<Integer>> result = new ArrayList<>();
        if(nums[left] + nums[mid] + nums[right] ==0){
                 List<Integer> array = Arrays.asList(nums[left],nums[mid],nums[right]);
                 result.add(array);
             }
        
        while (nums.length>3 && left <nums.length-2 ){
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                 right++;
                             if(right>=nums.length){
                mid++;
                right = mid+1;
            }
            if(mid>=nums.length-1){
                left++;
                mid = left+1;
                right = mid+1;
            }
                continue;
             }
             
             if(nums[left] + nums[mid] + nums[right] ==0 ){
                List<Integer> array = Arrays.asList(nums[left],nums[mid],nums[right]);
                Collections.sort(array);
                result.add(array);
             }

            right++;
            
            if(right>=nums.length){
                mid++;
                right = mid+1;
            }
            if(mid>=nums.length-1){
                left++;
                mid = left+1;
                right = mid+1;
            }
        }
        return result.stream().distinct().collect(Collectors.toList());
    }
}
