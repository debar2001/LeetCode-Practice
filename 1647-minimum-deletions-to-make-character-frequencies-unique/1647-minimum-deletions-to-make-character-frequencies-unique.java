class Solution {
    public int minDeletions(String s) {
int [] freq = new int [26];
for(int i = 0 ; i < s.length() ; i++){
freq[s.charAt(i) - 'a']++;
}
int delCount = 0;
HashSet HS = new HashSet<>();
for(int i =0 ; i<26 ; i++ ){
while(freq[i]>0 && HS.contains(freq[i]))
{
freq[i]--;
delCount++;
}
HS.add(freq[i]);
}
return delCount;
}
}