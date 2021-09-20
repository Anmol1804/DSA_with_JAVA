package com.anmol;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'j'};
        char target = 'j';
        char ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static char ceiling(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

             if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        // if not found we return start in ceil
        // we can use also start%length
        return letters[(start % letters.length)];
    }
}
