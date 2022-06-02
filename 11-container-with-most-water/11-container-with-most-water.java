import java.util.ArrayList;
class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        
        while(i < j)
        {
            int h = Math.min(height[i], height[j]);
            int w = j-i;
            area = Math.max(area, h*w);
            
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        
        return area;
//         int n = height.length;
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i+1; j < n; j++)
//             {
//                 int area = Math.min(height[i], height[j])*(j-i);
//                 arr.add(area);
//             }
//         }
        
//         int maxelement = arr.get(0);
        
//         for(int i = 0; i < arr.size(); i++)
//         {
//             if (maxelement < arr.get(i))
//                 maxelement = arr.get(i);
//         }
        
//         return maxelement;
        
    }
}