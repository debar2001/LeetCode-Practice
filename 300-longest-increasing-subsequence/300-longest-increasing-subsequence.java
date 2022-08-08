class Solution {
    public int lengthOfLIS(int[] arr) {
        List<Integer>al = new ArrayList<>();
        al.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > al.get(al.size()-1)) al.add(arr[i]);
            else{
                int j = binSearch(al, arr[i]);
                al.set(j, arr[i]);
            }
        }
        return al.size();
    }
    public int binSearch(List<Integer>al, int val){
        int lo = 0;
        int hi = al.size()-1;
        while(hi > lo){
            int mid = lo + (hi-lo)/2;
            if(al.get(mid) < val) lo = mid+1;
            else hi = mid;
        }
        return hi;
    }
}