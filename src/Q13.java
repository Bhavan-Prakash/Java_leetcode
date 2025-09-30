class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int occ = 1;
        Arrays.sort(arr);

        for(int i = 0 ; i<arr.length ; i++){
            int check = arr[i];
            for(int j = 0 ; j<arr.length ; j++){
                if(i == j){}else{
                    if(check == arr[j]){
                        occ++;
                    }
                    System.out.println(check + "is repeated " + occ + "times");
                }
            }
            occ = 1;

            break;

        }

        return true;
    }
}