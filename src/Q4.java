class Solution {
    public void moveZeroes(int[] nums) {
        int check =0;
        int f = 0;
        int []arr = new int[nums.length];
        for(int i = 0;i<=nums.length-1;i++){
            if(nums[i] == check){

            }else{

                arr[f] = nums[i];
                f++;

            }
        }

        for(int k =0;k<=arr.length-1;k++){
            nums[k]=arr[k];
        }
    }
}