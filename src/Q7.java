class Solution {
    public void reverseString(char[] s) {

        char[] copy = s.clone();

        int temp = copy.length - 1;
        int temp2 = 0;

        while (temp >= 0) {
            s[temp2] = copy[temp];
            temp--;
            temp2++;
        }
    }
}
