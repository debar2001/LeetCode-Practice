import java.util.*;
class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        ArrayList<Integer> temp = new ArrayList<Integer>(s.length());
        int sign  = 0;
        if (x<0)
            sign = -1;
        else
            sign = 1;
            
        x = Math.abs(x);
        
        while(x>=1){
            temp.add(x%10);
            x = x/10;
        }
        
        Collections.reverse(temp);
        
        int result = 0;
        
        for (int i = 0; i<temp.size(); i++){
            result += temp.get(i)*Math.pow(10,i);
        }
        
        result = result * sign;
        
        if ((result >= (Math.pow(2,31)-1)) || (result <= (Math.pow(-2,31)+1))){
            return 0;
        }
        else{
            return result;
        }
    }
}