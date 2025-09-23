// class Solution {
//     public int majorityElement(int[] nums) {

//         //int temp = 0;

//         if(nums.length == 1){
//             return nums[0];
//         }else{
//             for(int i = 0 ; i<= nums.length-1 ; i++){
//                 int temp = 1;
//             for(int j = 0 ; j<= nums.length-1 ; j++){
//                 if(i==j){
//                     j++;
//                 }else{
//                     if(nums[i] == nums[j]){
//                     temp++;
//                     if(temp >= (nums.length/2)){
//                         return nums[i];
//                     }
//                 }
//                 }

//             }
//         }


//         }


//         return 0;

//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length; i++){
            int temp = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                    temp++;
                }
            }
            if(temp > nums.length/2){
                return nums[i];
            }
        }

        return 0;
    }
}
