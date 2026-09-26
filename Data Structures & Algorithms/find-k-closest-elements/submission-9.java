class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    
    List<Integer> ans = new ArrayList<>();

    if(x<=arr[0]){
        for(int i=0;i<k;i++){
           ans.add(arr[i]); 
        }
        return ans;
    }

    if(x>=arr[arr.length-1]){
        for(int i=arr.length-k;i<arr.length;i++){
           ans.add(arr[i]); 
        }
        return ans;
    }

    int left = 0;
    while(left<arr.length && arr[left]<x ){
        left++;
    } 
    left--;
    int right = left+1;
    while(ans.size()<k){
        if(left<0){
            ans.add(arr[right]);
            right++;
        }
        else if (right >= arr.length) {
            ans.add(arr[left]);
            left--;
        }

        else if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
            ans.add(arr[left]);
            left--;
        }
        else if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
            ans.add(arr[right]);
            right++;
        }
        else if(Math.abs(arr[left]-x)==Math.abs(arr[right]-x)){
            ans.add(arr[right]);
            ans.add(arr[left]);
            left--;
            right++;
            
        }
    }
    Collections.sort(ans);
return ans;
    }
}