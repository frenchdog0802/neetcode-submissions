class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = sortString(strs[i]);
            List<String> list = new ArrayList<>();
            if (map.containsKey(str)) {
                list = map.get(str);
            } 

            list.add(strs[i]);
            map.put(str, list);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            result.add(list);
        }

        return result;
    }

    private String sortString(String str) {
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        return new String(strArray);
    }
}
