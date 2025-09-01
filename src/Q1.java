class Solution {
    public int[] twoSum(int[] nums, int target) {
        //initial approach but wrong

//        for(int i =0;i<=nums.length -1;i++){
//            if(nums[i]+nums[i+1] == target){
//                System.out.println(nums[i]+nums[i+1]);
//                return  new int[]{i,i+1};
//            }
//        }
//        return new int[]{};



        //correct appraoach

        for(int i =0 ; i<=nums.length-1 ; i++){
            for(int j = i+1 ; j<=nums.length -1 ; j++){
                if(nums[i] + nums [j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}