class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // num1.length = m+n;
        //int[] nums1 = new int[m + n];

        int test = 0;
        for(int i = m; i<=(m+n)-1; i++){
            nums1[i] = nums2[test];
            test++;
        }

        Arrays.sort(nums1);

        // for(int j =0;j<=nums1.length-1;j++){
        //     System.out.println(nums1[j]);
        // }
    }
}