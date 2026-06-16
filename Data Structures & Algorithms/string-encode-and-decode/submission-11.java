class Solution {

    public String encode(List<String> strs) {
        String result = "";    
        if(strs.isEmpty()){
            return result;
        }
        for (String str : strs ){
            if(str.equals("")){
               result+="<bert><comma>";
            } else {
                 result+=str+"<comma>";
            }
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str.length() == 0){
            return result;
        }
        String[] strs = str.split("<comma>");

        for (String s : strs){
            if(s.equals("<bert>")){
                result.add("");
            } else {
                result.add(s);
            }
        };

        return result;
    }
}
