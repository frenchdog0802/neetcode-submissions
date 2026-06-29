class Solution {
    Map<String , Integer> map = new HashMap<>();
    public int longestCommonSubsequence(String text1, String text2) {
        return helper(0,0,text1 , text2);
    }

    private int helper(int i , int j , String text1 , String text2){
        int result = 0;
        if(i==text1.length() ||j==text2.length() ){
            return 0;
        }
        String key = i+","+j;
        if(map.get(key)!=null){
            return map.get(key);
        }

        if(text1.charAt(i) == text2.charAt(j)){
            result =  1 + helper(i+1 , j+1 , text1 , text2);
        } else {
            result =  Math.max(helper(i+1 , j , text1 , text2 ), helper(i,j+1 , text1 , text2));
        }

       
        map.put(key , result);
        return result;
    }
}
