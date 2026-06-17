class Solution {
    public int strStr(String haystack, String needle) {
        int result =-1;
        int curr =0;
        int left =0;
        int right = 0;
        int start = 0;

        while(true){
            if(haystack.charAt(left) == needle.charAt(right)){
                left++;
                right++;
            } else {
                start++;
                left = start;
                right=0;
            }
            
            if(right == needle.length()){
                result = left-needle.length();
                break;
            }
            if(left >= haystack.length()){
                break;
            }
        }
        return result;
    }
}