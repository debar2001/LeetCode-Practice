class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m!=n){
            return false;
        }
        else{
            HashMap<Character, Integer> map = new HashMap<>();
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(int i=0; i<n; i++){
                int count = map.containsKey(s.charAt(i))? map.get(s.charAt(i)):0;
                map.put(s.charAt(i), count+1);
            }
            for(int j=0; j<m; j++){
                int count1 = map1.containsKey(t.charAt(j))? map1.get(t.charAt(j)):0;
                map1.put(t.charAt(j), count1+1);
            }
            return map.equals(map1);
        }
    }
}