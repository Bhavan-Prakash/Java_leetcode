class Solution {
    public int searchInsert(int[] nums, int target) {
        int temp = 0;
        if(nums.length == 1 && target>nums[0]){
            return nums.length;
        }else if(nums.length == 1 && target<nums[0]){
            return nums.length-1;
        }else{
            for(int i = 1 ; i<=nums.length-1 ; i++){
                //temp = nums[i];
                if(nums[i-1] == target){
                    return i-1;
                }else if(nums[i] == target){
                    return i;
                }else if(nums[i]>target && nums[i-1]<target){
                    return i;
                }
                else if(target > nums[nums.length-1]){
                    return nums.length;
                }
            }
        }

        return 0;

    }
}
