 public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right)
        {
            int walls = Math.min(height[left], height[right]);
            int area = walls * (right - left);
            max_area = Math.max(area, max_area);
            
            if (height[left] < height[right])
            {
                left++;
            }
            else
            {
                right --;
            }
        }
        return max_area;
        
    }
}
