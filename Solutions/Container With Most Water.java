class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int l=0;
        int r=height.length - 1;

        while(l<r){
            int curr_min;
            int curr_min_val;
            if (height[l]<=height[r]){
                curr_min = l;
                curr_min_val = height[l];
            }else{
                curr_min = r;
                curr_min_val = height[r];
            };
            int area = curr_min_val * (r-l);
            max = Math.max(max, area);

            if (curr_min==l){
                l++;
            }else{
                r--;
            };
        };

        return max;
}}