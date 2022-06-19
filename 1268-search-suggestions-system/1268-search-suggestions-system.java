class Solution {
    
    int left = 0;
    int right = 0;
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
     
        List<List<String>> res = new ArrayList<>();
        right = products.length - 1;
        Arrays.sort(products);
        
        for (int i = 0; i < searchWord.length(); ++i){
            res.add(helper(products, searchWord, i));
        }
        
        return res;
    }
    
    public List<String> helper(String[] prod, String s, int i){
        
        List<String> arr = new ArrayList<>();
        
        while (left <= right && (prod[left].length() <= i || s.charAt(i) != prod[left].charAt(i))) {
            left++;
        }
        
        while (left <= right && (prod[right].length() <= i || s.charAt(i) != prod[right].charAt(i))) {
            right--;
        }
        
        for (int j = left; j < left + 3 && j <= right; ++j){
            arr.add(prod[j]);
        }
        
        return arr;
    }
}