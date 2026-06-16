class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(result , new ArrayList<>() , s , 0);
        return result;
    }

    private void helper(List<List<String>> result , List<String> tempList , String s , int index){
        if (index == s.length()){
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i=index;i<s.length();i++){
            String subStr = s.substring(index , i+1);
            if(isPalindrome(subStr)){
                tempList.add(subStr);
                helper(result , tempList , s , i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s){
        if(s.length()==0){
            return true;
        }

        int left =0;
        int right = s.length()-1;
        while(right > left){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right --;
            left++;
        }

        return true;
    }
}
