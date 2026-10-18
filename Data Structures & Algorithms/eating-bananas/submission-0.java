class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int l = 1;
    int r = 0;
     for(int i=0;i<piles.length;i++){
        r = Math.max(r,piles[i]);
     }
    int ans = r;
    while(l<=r){
        int med = l+(r-l)/2;
        long hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile/med);
        }
        if(hours<=h){
            ans = med;
            r = med-1; 
        }
        else{
            l = med+1;
        }
    }
    return ans;
    }
}
