class Solution {
    public boolean isPossible(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o1.getKey() - o2.getKey());
        
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            pq.offer(e);
        
        while (!pq.isEmpty()) {
            int len = 1;
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
            Map.Entry<Integer, Integer> prev = pq.poll();
            prev.setValue(prev.getValue() - 1);
            list.add(prev);
            
                
            while (!pq.isEmpty() && pq.peek().getKey() - prev.getKey() == 1 && 
                   pq.peek().getValue() > prev.getValue()) {            
                
                Map.Entry<Integer, Integer> curr = pq.poll();
                prev = curr;
                prev.setValue(prev.getValue() - 1);
                list.add(prev);
                len++;
            }
            
            if (len < 3)
                return false;
            
            for (Map.Entry<Integer, Integer> e : list) 
                if (e.getValue() > 0)
                    pq.offer(e);
        }
        
        return true;
    }
}