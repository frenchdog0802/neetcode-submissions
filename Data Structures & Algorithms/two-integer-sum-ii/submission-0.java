class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // left pointer
        // right pointer
        int rightPointer = numbers.length-1;
        int leftPointer = 0;
        int result = numbers[rightPointer] + numbers[leftPointer];

        while (result != target){
             if(result>target){// result > target , need to shift right to left
                rightPointer--;
             } else { // resul < target , shift left to right
                leftPointer++;  
             }
             result = numbers[rightPointer] + numbers[leftPointer];
        }

        return new int[]{leftPointer+1,rightPointer+1};
        
    }
}
