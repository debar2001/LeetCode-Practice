class Solution {
    public int edgeScore(int[] edges) {
//         TreeMap<Integer, Long> map = new TreeMap<>();
//         int n = edges.length;
        
//         for(int i=0; i<n; i++){
//             long count = map.containsKey(edges[i])? map.get(edges[i]):0L;
//             map.put(edges[i], count+i);
//         }
//         Long max = Long.MIN_VALUE;
//         for(long value: map.values()){
//             max = Math.max(max, value);
//         }
//         int ans = 0;
//         for(int key: map.keySet()){
//             if(map.get(key)==max){
//                 ans = key;
//                 break;
//             }
//         }
//         // System.out.println(map);
//         return ans;
        TreeMap<Integer, Long> score = new TreeMap<>();
        
        for(int i=0; i<edges.length; i++){
            score.put(edges[i], score.getOrDefault(edges[i], 0L)+i);
        }
        
        int maxnode = 0;
        Long max = score.getOrDefault(0, Long.MIN_VALUE);
        
        for(int key: score.keySet()){
            if(score.get(key) > max){
                maxnode = key;
                max = score.get(maxnode);
            }
        }
        
        return maxnode;
    }
}