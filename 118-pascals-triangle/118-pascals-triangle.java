class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
		
		// Initially adding the numsRows of 1 and 2 to the result Obj as they form the base in building up the triangle.
        res.add(Arrays.asList(new Integer[]{1}));
        if (numRows == 1) {
            return res;
        }
        res.add(Arrays.asList(new Integer[]{1,1}));
        if (numRows == 2) {
            return res;
        }
        
		// initially assuming the prev value as the last added value in the result.
        List<Integer> prev = res.get(1);
        
		// used numRows-2 as we already have 2 values above.
        while (numRows-2 > 0) {
            List<Integer> curr = new ArrayList<>();
			// added 1 at first and added 1 at last position after the loop ends as they are constants/ 
            curr.add(1);
            for (int i = 1 ; i < prev.size() ; i++) {
                 curr.add(prev.get(i)+prev.get(i-1));               
            }
            curr.add(1);
			// adding all the values to result list.
            res.add(curr);
			// assigning the curr list as prev list to build the upcoming numbers.
            prev = curr;
            numRows--;
        }
        return res;
   
    }
}