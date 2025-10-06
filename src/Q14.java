class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int []arr = {0,1,2};

        for(int i = 0 ; i<n ; i++){

            if(n == 2){
                if(arr[i] != nums[i]){
                    return arr[i];
                }
            }else if(n==1){
                if(nums[i] != 1){
                    return 1;
                }
                else{
                    return 0;
                }
            }else{
                if(i != nums[i]){
                    return i;
                }
            }
            // if(i != nums[i]){
            //     return i;
            // }
        }

        return n;

    }

}
