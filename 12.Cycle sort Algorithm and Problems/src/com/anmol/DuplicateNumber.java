package com.anmol;

// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon Question
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,2};
        System.out.println(findDuplicate(arr));

    }

    static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        return nums[nums.length -1 ];
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
