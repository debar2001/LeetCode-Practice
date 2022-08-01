class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        for(char s: jewels.toCharArray()){
            int count = map1.containsKey(s)? map1.get(s):0;
            map1.put(s, count+1);
        }
        
        for(char a: stones.toCharArray()){
            int count1 = map.containsKey(a)? map.get(a):0;
            map.put(a, count1+1);
        }
        int ans = 0;
        for(char key: map.keySet()){
            if(map1.containsKey(key)){
                ans += map.get(key);
            }
        }
        return ans;
    }
}