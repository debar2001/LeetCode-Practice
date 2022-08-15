class Solution {
    public String intToRoman(int num) {
        // TreeMap<Integer, String> map = new TreeMap<>();
        // map.put(1000, "M");
        // map.put(900, "CM");
        // map.put(500, "D");
        // map.put(400, "CD");
        // map.put(100, "C");
        // map.put(90, "XC");
        // map.put(50, "L");
        // map.put(40, "XL");
        // map.put(10, "X");
        // map.put(9, "IX");
        // map.put(5, "V");
        // map.put(4, "IV");
        // map.put(1, "I");
        // Collections.reverse(map);
        int[] key = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String ans = "";
        
        for(int i=0; i<key.length; i++){
            while(num>=key[i]){
                ans += strs[i];
                num -= key[i];
            }
        }
        return ans;
    }
}