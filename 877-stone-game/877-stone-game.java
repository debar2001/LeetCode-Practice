class Solution {
//     public boolean stoneGame(int[] piles) {
//         int n = piles.length;
//         int l = 0;
//         int r = n-1;
//         int Alice_stones = 0;
//         int Bob_stones = 0;
//         int turn = 0;
//         while(l<=r){
//             if(piles[l]>piles[r]){
//                 if(turn%2==0){
//                     Alice_stones += piles[l];
//                     turn++;
//                     l++;
//                 }
//                 else{
//                     Bob_stones += piles[l];
//                     turn++;
//                     l++;
//                 }
//             }
//             else{
//                 if(turn%2==0){
//                     Alice_stones += piles[r];
//                     turn++;
//                     r--;
//                 }
//                 else{
//                     Bob_stones += piles[r];
//                     turn++;
//                     r--;
//                 }
//             }
//         }
        
//         int max = Math.max(Alice_stones, Bob_stones);
//         if(Alice_stones == max){
//             return true;
//         }
//         return false;
//     }
    int [][][] memo;
    public boolean stoneGame(int[] piles) {
        memo = new int[piles.length + 1][piles.length + 1][2];
        for(int [][] arr : memo)
            for(int [] subArr : arr)
                Arrays.fill(subArr, -1);
        
        return (helper(0, piles.length - 1, piles, 1) >= 0);
    }
    
    public int helper(int l, int r, int [] piles, int ID){
        if(r < l)
            return 0;
        if(memo[l][r][ID] != -1)
            return memo[l][r][ID];
        
        int next = Math.abs(ID - 1);
        if(ID == 1)
            memo[l][r][ID] = Math.max(piles[l] + helper(l + 1, r, piles, next), piles[r] + helper(l, r - 1, piles, next));
        else
            memo[l][r][ID] = Math.min(-piles[l] + helper(l + 1, r, piles, next), -piles[r] + helper(l, r - 1, piles, next));
        
        return memo[l][r][ID];
    }
}