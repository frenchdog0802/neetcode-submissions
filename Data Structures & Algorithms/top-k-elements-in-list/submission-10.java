class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //MapHeap

        Map<Integer , Integer> countMap = new HashMap<>();


        for (int i=0;i<nums.length;i++){
            countMap.put(nums[i] , countMap.getOrDefault(nums[i] , 0 ) +1);
        }

        PriorityQueue<Integer> maxHeap = new  PriorityQueue<>((a,b) -> countMap.get(b)-countMap.get(a));
        for (int key : countMap.keySet()){
            maxHeap.offer(key);
        }

        int[] result = new int[k];
        int index = 0;
        while(k>0){
            result[index] = maxHeap.poll();
            k--;
            index++;
        }

        return result;
    }
}
