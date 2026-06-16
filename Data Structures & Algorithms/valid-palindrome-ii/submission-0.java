class Solution {
    public boolean validPalindrome(String s) {
        String[] arr = s.split("");
        int left = 0;
        int right = arr.length - 1;
        int error = 0;
        while (right >= left) {
            if (!arr[left].equals(arr[right])) {
                return isPalindrome(arr, left + 1, right) || isPalindrome(arr, left, right - 1);
            }
            ;
            left++;
            right--;
        }

        return true;
    };

    private boolean isPalindrome(String[] arr, int left, int right) {
        while (right > left) {
            if (!arr[left].equals(arr[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}