// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate = 0;
        int votes = 0;
        
        for(int i=0; i<a.length; i++){
            if(a[candidate]==a[i]){
                votes++;
            }
            else{
                votes--;
            }
            if(votes==-1){
                candidate = i;
                votes = 0;
            }
        }
        
        votes = 0;
        for(int j=0; j<a.length; j++){
            if(a[j] == a[candidate]){
                votes++;
            }
        }
        if(votes>(a.length/2)){
            return a[candidate];
        }
        else{
            return -1;
        }
    }
}