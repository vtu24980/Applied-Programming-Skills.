class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                // First half adds, second half subtracts
                if (i < mid) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return count == 0;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
