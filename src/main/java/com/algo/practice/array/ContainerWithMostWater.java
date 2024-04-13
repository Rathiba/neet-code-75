package com.algo.practice.array;
//BruteforceApproach
public class ContainerWithMostWater {
    public int findWater(int[] height) {
        int n = height.length - 1;
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }


    public int findWaterTwoPointer(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxWater=0;
        int area1;
        while(left<right){
          if(height[left]<=height[right]){
              area1=height[left]*(right-left);
              left++;
          } else {
              area1=height[right]*(right-left);
              right--;
          }
          if(area1>maxWater){
              maxWater=area1;
          }
        }
        return maxWater;
    }
}