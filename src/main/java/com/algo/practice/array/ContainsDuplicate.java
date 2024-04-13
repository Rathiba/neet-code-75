package com.algo.practice.array;

import java.util.HashSet;

public class ContainsDuplicate {
   /* public boolean containsDuplicateByBruteForce(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;i<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }*/
    public boolean containsDuplicateByHashSet(int[] nums){
        HashSet<Integer> valueAdd=new HashSet<>();
        for(int num:nums){
            if(valueAdd.contains(num)){
                valueAdd.add(num);
                return true;
            }
        }
        return false;
    }
}
