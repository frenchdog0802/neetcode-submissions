class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()){
            return null;
        }
        StringBuilder result = new StringBuilder();
        
        for (int i=0;i<strs.size();i++){
            if (i>0){
                result.append(",gg123");
            };
            result.append(strs.get(i));
        };
        return result.toString();
    };

    public List<String> decode(String str) {
        if(null == str){
            return new ArrayList<>();
        }
        return  Arrays.asList(str.split(",gg123"));
    };
}
