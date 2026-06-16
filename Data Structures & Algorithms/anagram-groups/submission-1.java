class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
           
            String key = new String(array);
            if(map.get(key) != null){
                map.get(key).add(str);
            } else {
                List<String> arayList = new ArrayList<>();
                arayList.add(str);
                 map.put(new String(key) , arayList);
            }
        }

        for(String key : map.keySet()){
            result.add(map.get(key));
        };

        return result;
        
    }
}
