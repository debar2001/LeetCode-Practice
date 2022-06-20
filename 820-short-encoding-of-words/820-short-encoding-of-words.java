class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)-> b.length()-a.length());
        StringBuffer sb = new StringBuffer();
        for(String word: words){
            if(sb.indexOf(word+"#")==-1){
                sb.append(word+"#");
            }
        }
        return sb.length();
    }
}