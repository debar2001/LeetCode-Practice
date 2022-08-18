class Solution {
    public int minSetSize(int[] arr) {
        int size= arr.length, res= 0, n= arr.length;//initializing 
      Map<Integer, Integer> map= new HashMap<>();//Element -- frequency 
      
      for(int i= 0; i< n; i++)
          map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1);//frequency of the element present in the Array 
      
      PriorityQueue<Map.Entry<Integer, Integer>> maxHeap= new PriorityQueue<>((a, b)->{
        return b.getValue()-a.getValue();
      });//Max heap, to  give give priority to the high frequency element 
      
      for(Map.Entry<Integer, Integer> entry: map.entrySet())
          maxHeap.offer(entry);//puting the element --frequency pair into the max Heap, to prioritising according to the frequency 
      
		  while(size > n/2){//half of the integers of the array are removed constraint 
			   size-= maxHeap.poll().getValue();//reducing the size 
			   res+= 1;//counting the set size 
		  }
		  return res;//returning the minimum size of the set 
    }
}