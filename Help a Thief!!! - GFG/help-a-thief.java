// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int T = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int i=0; i<N; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCoins(A,B,T,N));
        }
    }
}// } Driver Code Ends


class Solution {
    
    static int maxCoins(int[] A, int[] B, int T, int N) {
        // code here
        if(T == 0) return 0;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        for(int i = 0; i < N; ++i){
            maxHeap.offer(new int[]{B[i],A[i]});
        }
        int ans = 0;
        while(T > 0 && !maxHeap.isEmpty()){
            int[] tmp = maxHeap.poll();
            for(int i = tmp[1]; i >= 0; --i){
                if(T >= i){
                    ans += tmp[0]*i;
                    T -= i;
                    break;
                }
            }
        }
        return ans;
    }
}