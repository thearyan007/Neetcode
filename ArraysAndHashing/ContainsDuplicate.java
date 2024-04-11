package NeetCode.ArraysAndHashing;

import java.util.HashSet;

// Leetcode 217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans= containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

}
