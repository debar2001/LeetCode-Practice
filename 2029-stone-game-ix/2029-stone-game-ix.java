class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zero = 0, one = 0, two = 0;
        for(int i: stones) {
            if(i %3 == 0) zero++;
            else if(i%3 == 1) one ++;
            else if(i%3 == 2) two ++;
        }
        if(one == 0 && two == 0) return false;
        int max = Math.max(one, two), min = Math.min(one, two);
        if(zero%2 == 0){
            if(min == 0) return false;
            return true;
        }
        if(zero%2 == 1){
            if(max -2 > min) return true;
            return false;
        }
        return false;
        
    }
}