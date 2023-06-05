class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase();
        newString = newString.replaceAll("[^a-z0-9]","");

        int l = 0;
        int r = newString.length()-1;

        while(l<r){
            char current_l = newString.charAt(l);
            char current_r = newString.charAt(r);

            if (current_l != current_r){
                return false;
            };

            l++;
            r--;
        };

        return true;
    };
}