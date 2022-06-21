class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //To reach furthest building.. we need to make sure that ladders are used for higher jumps.
        //we have L ladders.. so we will maintain a queue of L largest jumps at any given moment.
        //Use PriorityQueue for that purpose. It will be sorted in 
        int maxQueueSize = ladders;
        Queue<Integer> queue = new PriorityQueue(); //We have higher jumps at end and lower jumps at starting
        //so that it is easier to remove lower jumps whenever we want.
        int sum = 0; //maintaing sum of remaining jumps so far.
        int furthestReach = heights.length - 1;
        int currHeight = heights[0];
        for(int i=1;i<heights.length;i++){
            int diff = heights[i]-currHeight;
            if(diff > 0){
                if(maxQueueSize == 0){
                    sum+=diff; 
                }
                //we need to decide if diff will be served via bricks or ladders.
                //if queue is not full then use remaining ladders to serve this jump.
                else if(queue.size() < maxQueueSize){
                    queue.add(diff);
                }else if(queue.peek() < diff){ //If queue is full, then check if queue this jump deserves to be part of queue, by checking least jump with this jump.
                    int removedJump = queue.poll(); 
                    queue.add(diff); //use ladder for current diff and bricks for removedJump.
                    sum+=removedJump; 
                }else{
                   //current diff should be served using bricks.
                    sum+=diff;
                }

                if(sum > bricks){
                   //we can't do this jump.
                   furthestReach = i-1;
                   break;
                }
            }
            currHeight = heights[i];

        }
        return furthestReach;
        
    }
}