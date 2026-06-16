class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int left =0;
      int right =1;


      while(left<numbers.length-1){
        if((numbers[left] + numbers[right]) == target){
            return new int[]{left+1,right+1};
        }
        right++;
        if(right== numbers.length){
            left++;
            right = left+1;
        }
      }
      return new int[1];
    }
}
