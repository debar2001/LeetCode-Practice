class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<paths.size(); i++){
            for(int j=0; j<paths.get(i).size(); j++){
               if(j==0){
                  int count = map.containsKey(paths.get(i).get(j))? map.get(paths.get(i).get(j)):0;
                  map.put(paths.get(i).get(j), count-1);
               }
                else{
                    int count = map.containsKey(paths.get(i).get(j))? map.get(paths.get(i).get(j)):0;
                    map.put(paths.get(i).get(j), count+1);
                }
            }
        }
        String ans = "";
        for(String key: map.keySet()){
            if(map.get(key)==1){
                ans = key;
                break;
            }
        }
        
        return ans;
    }
}