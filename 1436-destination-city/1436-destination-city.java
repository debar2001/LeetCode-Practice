class Solution {
    public String destCity(List<List<String>> paths) {
//         HashMap<String, Integer> map = new HashMap<>();
//         for(int i=0; i<paths.size(); i++){
//             for(int j=0; j<paths.get(i).size(); j++){
//                if(j==0){
//                   int count = map.containsKey(paths.get(i).get(j))? map.get(paths.get(i).get(j)):0;
//                   map.put(paths.get(i).get(j), count-1);
//                }
//                 else{
//                     int count = map.containsKey(paths.get(i).get(j))? map.get(paths.get(i).get(j)):0;
//                     map.put(paths.get(i).get(j), count+1);
//                 }
//             }
//         }
//         String ans = "";
//         for(String key: map.keySet()){
//             if(map.get(key)==1){
//                 ans = key;
//                 break;
//             }
//         }
        
//         return ans;
        
        HashSet<String> myHashSet=new HashSet();
        for(int i=0;i<paths.size();i++)
              myHashSet.add(paths.get(i).get(0));
        
        for(int i=0;i<paths.size();i++) {
            if(!myHashSet.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return null;
    }
}