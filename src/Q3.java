class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int numb = 0;
        for(int i = 1;i<=nums.length-1;i++){
            numb = nums[i-1];
            if(numb == nums[i]){
                return true;
            }
        }
        return false;
    }
}

//my first approach was wrong then i saw that the sort method and then thats how i solved the ques
