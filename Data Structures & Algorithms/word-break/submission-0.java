class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<Integer,Boolean> map = new HashMap<>();
        return helper(s ,wordDict , 0 , map );
    }

    private boolean helper (String s, List<String> wordDict , int index , Map<Integer , Boolean> map){
        if(index== s.length()){
            return true;
        }

        if(map.get(index)!=null){
            return map.get(index);
        }

        for (int i=index;i<s.length();i++){
            String subs = s.substring(index , i+1);
            if(wordDict.contains(subs)){
                if (helper(s, wordDict, i + 1, map)) {
                    map.put(index, true);
                    return true;
                }
            } 
        }
        map.put(index, false);
        return false;
    }
}
