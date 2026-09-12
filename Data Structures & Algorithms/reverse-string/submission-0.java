class Solution {
    public void swap(char[] arr,int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void reverseString(char[] s) {
       int left = 0;
       int right = s.length - 1;
       while(left <= right){
        swap(s,left,right);
        left++;
        right--;
       }
    }
}