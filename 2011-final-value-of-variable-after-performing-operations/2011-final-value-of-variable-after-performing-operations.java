class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String i:operations)
        {
            switch(i.charAt(1))
            {
                case '+': count += 1;break;
                case '-': count -= 1;break;
            }
                
        }
        return count;   
    }
}