class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, (right -  left) * min);
            if (height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    
    }
}