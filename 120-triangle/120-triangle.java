import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i>=0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                int min1 = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                int sum1 = min1 + triangle.get(i).get(j);
                triangle.get(i).set(j, sum1);
            }
        }
        return triangle.get(0).get(0);
    }
}