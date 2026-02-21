class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // int n = matrix.length;
        // int low =metrix[0][0];
        // int high = matrix[n-1][n-1];
        // while (low <= high){
        //     int mid = low + ((high - low)/2);
        // }
        int row = matrix.length;
        int col = matrix[0].length;
        int count =0;

        int[] arr = new int[row*col];

        for(int i =0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[count++] = matrix[i][j];

            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}