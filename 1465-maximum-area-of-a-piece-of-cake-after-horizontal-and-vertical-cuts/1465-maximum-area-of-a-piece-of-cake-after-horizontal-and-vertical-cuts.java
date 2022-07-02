class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
       int maxInHorizontalCut = 0; 
       int maxInVerticalCut = 0; 
       Arrays.sort(horizontalCuts);
       Arrays.sort(verticalCuts);
        
        int initialCut = 0;
        
        for (int i = 0; i < horizontalCuts.length; i++) { 
            
            int cut = horizontalCuts[i];
            maxInHorizontalCut = Math.max(maxInHorizontalCut, cut - initialCut);
            initialCut = cut;
            
        }
        
        maxInHorizontalCut = Math.max(maxInHorizontalCut, h - initialCut);
		
        initialCut = 0;
        for (int i = 0; i < verticalCuts.length; i++) { 
            
            int cut = verticalCuts[i];
            maxInVerticalCut = Math.max(maxInVerticalCut, cut - initialCut);
            initialCut = cut;
            
        }
        
        maxInVerticalCut = Math.max(maxInVerticalCut, w - initialCut);
       
        return (int)((long)maxInHorizontalCut * maxInVerticalCut % 1000000007);
        
    }
}