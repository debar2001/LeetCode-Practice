class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
//         HashMap<Character, Integer> universal = new HashMap<>();
//         List<String> ret = new LinkedList<>();

//         for (String str: words2) {
//             HashMap<Character, Integer> temp = new HashMap<>();
//             for (char c: str.toCharArray()) {
//                 temp.merge(c, 1, Integer::sum);
//             }
//             // update universal word's every char count.
//             for (char c: temp.keySet()) {
//                 int time = temp.get(c);
//                 if (universal.containsKey(c)) {
//                     universal.put(c, Math.max(universal.get(c), time));
//                 } else {
//                     universal.put(c, time);
//                 }
//             }
//         }

//         for (String str: words1) {
//             HashMap<Character, Integer> temp = new HashMap<>();
//             for (char c: str.toCharArray()) {
//                 temp.merge(c, 1, Integer::sum);
//             }

//             boolean flag = true;
//             for (char c: universal.keySet()) {
//                 if (!temp.containsKey(c) || temp.get(c) < universal.get(c)) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 ret.add(str);
//             }
//         }

//         return  ret;
        List<String> res = new ArrayList<>();
        Map<Character, Integer> store = new HashMap<>();
        for(String word : words2) {
            Map<Character, Integer> map = new HashMap<>();
            for(char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                store.put(c, Math.max(map.get(c), store.getOrDefault(c, 0)));
            }
        }
        
        for(String word : words1) {
            boolean inAns = true;
            Map<Character, Integer> clone = new HashMap<>();
                
            for(char c : word.toCharArray())
                clone.put(c, clone.getOrDefault(c, 0) + 1);

            for(char key : store.keySet())
                if(store.get(key) > clone.getOrDefault(key, 0)) {
                    inAns = false;
                    break;
                }
            if(inAns)
                res.add(word);
        }
        return res;
    }
}