class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        Set<String> set = new HashSet<>();
        String[] arr = s.split("");
        int longestSize = 0;
        int left = 0;

        for(int right=0;right<arr.length;right++){
            if (set.contains(arr[right])){
                // remove until no duplicate
                while(set.contains(arr[right])){
                    set.remove(arr[left]);
                    left++;
                }
            } 
            
            set.add(arr[right]);
            int size = set.size();
            longestSize = Math.max(size , longestSize);
        }
        
        return longestSize;
    }
}
