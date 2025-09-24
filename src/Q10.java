class Solution {
    public int heightChecker(int[] heights) {

        int result = 0;

        // int []arr = new int[heights.length];
        int [] arr = heights.clone();
        Arrays.sort(arr);

        if(heights.length == 1){
            return result;
        }else{

            for(int i =0 ; i<=heights.length-1; i++){
                if(heights[i] != arr[i]){
                    result++;
                }
            }

        }



        return result;

    }
}