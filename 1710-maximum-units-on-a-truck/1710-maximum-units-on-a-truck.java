class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, Comparator.comparingInt(a -> -a[1]));

    int j=0,ans=0;
    for(int i=0;i<boxTypes.length;i++){
        if(j>truckSize) break;
            if(boxTypes[i][0]<=truckSize-j) ans+=boxTypes[i][0]*boxTypes[i][1];
        else if(boxTypes[i][0]>truckSize-j) ans+=(truckSize-j)*boxTypes[i][1];
            j+=boxTypes[i][0];
    }
    return ans;
}
}