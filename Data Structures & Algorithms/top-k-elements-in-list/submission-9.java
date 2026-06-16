class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        };

            Map<Integer, Integer> sortMap =
            map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    LinkedHashMap::new
                ));


        
        List<Integer> result = new ArrayList<>();
        int count = 1;

        for(Integer key : sortMap.keySet()){
            result.add(key);
            if(count==k){
                break;
            }else{
                count++;
            }
        };

        return result.stream().mapToInt(i -> i).toArray();
    }
}
