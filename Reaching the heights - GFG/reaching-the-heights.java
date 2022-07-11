// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.reaching_height(N, arr);
        	
        	if(ans.size() == 1 && ans.get(0) == -1){
        	    System.out.println("Not Possible");
        	    continue;
        	}
        	
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}






// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> reaching_height (int n, int arr[]) {
        //Complete the function
        ArrayList<Integer> res = new ArrayList<Integer>(n);
        Arrays.sort(arr);
        if(areSame(arr, n) && n>1){
            res.add(-1);
            return res;
        }
        for(int i=0; i<n; i++){
            if(i%2==0){
                res.add(arr[n-1-(i/2)]);
            }
            else{
                res.add(arr[i/2]);
            }
        }
        return res;
    }
    public static boolean areSame(int arr[], int n)
    {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<n; i++){
           s.add(arr[i]); 
        }
 
        return (s.size() == 1);
    }
    
    
}
