class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch: arr){
            int count = map.containsKey(ch)? map.get(ch):0;
            map.put(ch, count+1);
        }
        int ans = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}