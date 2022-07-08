class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
            else if(map.containsValue(ch2)){
                return false;
            }
            else{
                map.put(ch1, ch2);
            }
        }
        return true;
    }
}