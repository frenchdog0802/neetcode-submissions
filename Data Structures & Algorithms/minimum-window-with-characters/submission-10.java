class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int left =0;
        int minL = Integer.MAX_VALUE;
        String result = null;
        for (int right =1;right<=s.length();right++){
            String substr = s.substring(left,right);
            boolean containstr = helper(substr , t);
            while(containstr && right > left){
                int currentLeng =  right-left;
                if(minL > currentLeng){
                   minL = currentLeng; 
                   result = substr;
                }
                left++;
                substr = s.substring(left,right);
                containstr = helper(substr , t);
            }
        }
        return result == null ? "" : result;
    }

private boolean helper(String s, String t) {
        int[] counts = new int[128]; // Tracks character frequencies
        
        // Count what we need from t
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i)]++;
        }
        
        // Match them against what we have in s
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]--;
        }
        
        // If any character count is still > 0, s doesn't contain all of t
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                return false;
            }
        }
        
        return true;
    }
}
