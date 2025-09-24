class Solution {
    public int[] sortedSquares(int[] nums) {

        int []arr = new int[nums.length];

        if(nums.length == 1){
            arr[0] = nums[0]*nums[0];
            return arr;
        }else{



            for(int i =0 ; i<=nums.length-1 ; i++){
                arr[i] = nums[i]*nums[i];
            }

            Arrays.sort(arr);
            return arr;

        }




    }
}