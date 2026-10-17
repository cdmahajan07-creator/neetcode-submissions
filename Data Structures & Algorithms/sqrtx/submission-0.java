class Solution {
    public int mySqrt(int x) {
    int low = 1;
    int high = x;
    int ans = 0;
    
    while(low<=high){
        int mid = low+(high-low)/2;

        long sqaure = (long)mid*mid;
        if(sqaure==x)
        return mid;
        else if(sqaure<x){
            ans = mid;
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return ans;  
    }
}