class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candies = 0;
        int up = 0, down = 0;
        int prevslope = 0;
        for(int i=1; i<n; i++){
            int currslope = ratings[i] > ratings[i-1] ? 1
                : (ratings[i] < ratings[i-1] ? -1:0);
            
            if((prevslope<0 && currslope>=0)||(prevslope>0 && currslope==0)){
                candies = candies + sum(up) + sum(down) + Math.max(up, down);
                up = 0;
                down = 0;
            }
            
            if(currslope > 0) up++;
            else if(currslope < 0) down++;
            else candies++;
            
            prevslope = currslope;
        }
        candies = candies + sum(up) + sum(down) + Math.max(up, down) + 1;
        return candies;
    }
    private int sum(int n){
        return (n*(n+1))/2;
    }
    
}