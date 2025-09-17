// class Solution {
//     public int singleNumber(int[] nums) {



//         Arrays.sort(nums);

//         //int test = nums[0];

//         for(int i = 0;i<=nums.length-1;i+=2){
//             // test = nums[i-1];
//             //System.out.println(test);
//             if(nums[i] != nums[i+1]){
//                 return nums[i];
//             // }else{
//             //     // test = nums[i];
//             // }
//         }
//         // return test;
//     }
//         return 0;

//     }
// }


import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
