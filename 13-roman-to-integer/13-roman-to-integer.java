class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char[] que = s.toCharArray();
        
        int n = que.length;
        int ans = 0;
        if(n==1){
            ans += map.get(que[0]);
        }
        else{
            int i=0;
            while(i<n){
                if(i != (n-1)){
                if(map.get(que[i])<map.get(que[i+1])){
                    ans += (map.get(que[i+1])-map.get(que[i]));
                    i += 2;
                }
                else{
                    ans += map.get(que[i]);
                    i++;
                }}
                else{
                    ans += map.get(que[i]);
                    i++;
                }
            }
        }
        return ans;
    }
}