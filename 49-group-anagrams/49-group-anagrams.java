class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String str1 = new String(arr);
            
            if(map.containsKey(str1)){
                map.get(str1).add(str);
            }
            else{
                map.put(str1, new ArrayList<>());
                map.get(str1).add(str);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}