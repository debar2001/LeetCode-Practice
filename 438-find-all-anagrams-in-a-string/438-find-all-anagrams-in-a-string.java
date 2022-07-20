class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int right = 0;
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int valid = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            right ++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while(right-left >= p.length()){
                if(valid == need.size()){
                    ans.add(left);
                }
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return ans;
    }
}