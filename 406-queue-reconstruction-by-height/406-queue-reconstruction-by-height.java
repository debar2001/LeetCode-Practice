class Solution {
    public int[][] reconstructQueue(int[][] people) {
         int[][] res = new int[people.length][2];
        int[] pos = new int[people.length];
        
        Arrays.sort(people, (a,b) -> {
            return a[0] - b[0] == 0 ? b[1] - a[1] : a[0] - b[0];
        });
        
        for (int i = 0; i < people.length; i++) {
            int posCurr = people[i][1];
            int posCount = 0;
            for (int j = 0; j < pos.length; j++) {
                if (pos[j] == 0) {
                    if (posCount == posCurr) {
                        pos[j] = 1;
                        res[j] = people[i];
                        break;
                    } else {
                        posCount++;
                    }
                }
            }
        }
        return res;
    }
}