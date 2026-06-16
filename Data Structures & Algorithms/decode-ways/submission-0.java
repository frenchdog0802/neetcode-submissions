class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    public int numDecodings(String s) {
        return backtrack(s,0);
    }

    private int backtrack(String s , int index){
        if(index == s.length()){
            return 1;
        }
        if(s.charAt(index) =='0'){
            return 0;
        }

        if(memo.containsKey(index)){
            return memo.get(index);
        }

        int res = backtrack(s,index+1);
        if(index+1 < s.length()){
            int doubleDigit = Integer.parseInt(s.substring(index,index+2));
            if(doubleDigit<=26){
                res += backtrack(s, index + 2);
            }
        }

        memo.put(index, res);
        return res;
    }
}
