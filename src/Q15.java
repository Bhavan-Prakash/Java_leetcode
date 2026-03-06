class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        List<Integer> result_final = new ArrayList<>();

        if(nums.length == 0){
            result.add(-1);
            result.add(-1);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                result.add(i);
            }else if(i == nums.length-1 && result.size() == 0){
                result.add(-1);
                result.add(-1);
            }
        }

        if(result.size() == 1){
            result.add(result.get(0));
        }

        if(result.size() > 2){
            result_final.add(result.get(0));
            result_final.add(result.get(result.size()-1));
        }else{
            result_final.addAll(result);
        }

        int[] result_arr = new int[result_final.size()];
        for(int i =0 ; i<result_final.size();i++){
            result_arr[i] = result_final.get(i);
        }

        return result_arr;
    }
}