class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length ;
        int[] arr = new int[n];
        arr[0] = nums[0];
        dq.addLast(0);
        for(int i = 1 ; i< n ; i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k)
                dq.removeFirst() ;
            arr[i] = nums[i] + arr[dq.peekFirst()] ;
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.removeLast();
            dq.addLast(i);
        }
        return arr[n-1];
    }
}