class Solution {
    public int maxArea(int[] heights) {
    int left = 0;
    int right = heights.length-1;   
    int area = 0;
    while(left<right){
        if(heights[left]<heights[right]){
            int ar = heights[left]*(right-left);
            area = Math.max(area,ar);
            left++;
        }
        else if(heights[left]>=heights[right]){
            int ar = heights[right]*(right-left);
            area = Math.max(area,ar);
            right--;
        }
    }
    return area;
    }
}
