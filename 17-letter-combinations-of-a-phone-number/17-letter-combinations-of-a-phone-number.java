class Solution {
    Map<Character, String> map;
List<String> list;
public List<String> letterCombinations(String digits) {
    
    list = new ArrayList<>();
    if(digits.length() == 0) return list;
    
    map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    
    combination(digits, 0, "");
    
    return list;
}

void combination(String digits, int i, String str){
    
    if(i == digits.length()){
        
        list.add(str);
        return;
    }
    
    for(char ch: map.get(digits.charAt(i)).toCharArray()){
        
        combination(digits, i+1, str + ch);
    }
}
}