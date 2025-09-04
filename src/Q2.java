class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0 ; i<=nums.length - 1 ; i++ ){
            if(nums[i] == val){

            }else{
                nums[k] = nums[i];
                k++;
            }
        }

        // for(int l = 0;l<=nums.length -1 ; l++){
        //     System.out.println(nums[l]);
        //   }
        return k;

    }
}