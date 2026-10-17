class Solution {
    public boolean search(int[][] matrix,int target,int m){
        while(m<matrix.length){
        if(target<matrix[m][0]) return false;
        else if(target>matrix[m][matrix[m].length-1]){
            m++;
        }
        else{
            for(int i=0;i<matrix[m].length;i++){
                if(matrix[m][i]==target)
                    return true;
            }
            return false;
        }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       return search(matrix,target,0);
    }
}
