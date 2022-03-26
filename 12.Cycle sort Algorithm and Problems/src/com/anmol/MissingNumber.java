package com.anmol;

// https://leetcode.com/problems/missing-number/
// Amazon Question

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]< nums.length && nums[i] != nums[correct]){
                    swap(nums, i, correct);
            }

            else{
                i++;
            }
        }

        // case1 : if num < n not present returning it
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]){
                return j;
            }
        }

        // case2 : when last not present
        return nums.length;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
