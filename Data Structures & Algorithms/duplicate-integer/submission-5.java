class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        boolean result = false;
        for (int i : nums){
             if(map.get(i) == null){
                map.put(i,0);
             } else {
                map.put(i,map.get(i)+1);
                result = true;
             }
        }
       
       return result;
    }
}