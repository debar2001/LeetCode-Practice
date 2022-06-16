// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
       // Your code goes here
       Set<Character> set = new HashSet<>();
       Map<Character, Integer> map = new HashMap<>();
       for(int i=0; i<str.length(); i++){
           set.add(str.charAt(i));
       }
       int i = 0, j = 0; 
       int ans = str.length();
       for(j=0 ; j<str.length(); j++){
           map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
           while(map.size() == set.size()){ // use for reduce substring length from starting of substring
               ans = Math.min(ans, j-i+1);
               // System.out.println(str.charAt(i));
               //  map.get(str.charAt(i))--;   show error unexpected type
               // that why use map.put again
               map.put(str.charAt(i), map.get(str.charAt(i))-1);
               if(map.get(str.charAt(i)) == 0)
                   map.remove(str.charAt(i));
               i++;
           }
       }
       return ans;
   }
}