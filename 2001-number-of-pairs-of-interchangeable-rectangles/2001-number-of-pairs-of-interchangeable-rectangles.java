class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
//         HashMap<Double, Integer> map = new HashMap<>();
        
//         for(int i=0; i<rectangles.length; i++){
//             double a = (double)rectangles[i][0]/(double)rectangles[i][1];
//             int count = map.containsKey(a)? map.get(a):0;
//             map.put(a, count+1);
//         }
//         long ans = 0;
//         for(int value: map.values()){
//             if(value>1){
//                 ans += (long)(((value)*(value-1))/2);
//             }
//         }
//         return ans;
        
        long result = 0;
        Map<Double, Integer> map = new HashMap();
        
        //calculate the div
        for (int[] rectangle : rectangles) {
            double div = (double) ((double) rectangle[1] / (double) rectangle[0]);
            map.put(div, map.getOrDefault(div, 0) + 1);
        }
        
        
        //sigma the total count for each div
        for (int count : map.values()) {
            for (int i = 1; i < count; i++) {
                result += i;
            }
        }
        
        return result;
    }
}