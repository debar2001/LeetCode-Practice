class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans = new ArrayList<>();
        
        for(String word: words){
            if(match(word, pattern)==true) ans.add(word);
        }
        return ans;
    }
    public boolean match(String word, String pattern){
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        for(int i=0; i<word.length(); i++){
                char w = word.charAt(i);
                char p = pattern.charAt(i);
                if(!map.containsKey(w)) map.put(w, p);
                if(!map1.containsKey(p)) map1.put(p, w);
                if((w != map1.get(p))||(p != map.get(w))) return false;
        }
        return true;
    }

}