package com.anmol;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,5,6,8};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        findAllIndex(arr, 4 ,0);
//        System.out.println(list);
//
//        System.out.println(listOfIndex(arr, 4, 0, new ArrayList<>()));

        ArrayList<Integer> ans = listOfIndex_new(arr, 4, 0);
        System.out.println(ans);
    }

    static boolean find(int arr[], int target, int index){
        if(index == arr.length){
            return false;
        }

        return (arr[index]== target) || (find(arr, target, index+1));
    }

    static int findIndex(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index+1);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);

    }

    // Important approach
    static ArrayList<Integer> listOfIndex(int arr[], int target, int index, ArrayList<Integer> ls){
        if(index == arr.length){
            return ls;
        }

        if(arr[index] == target){
            ls.add(index);
        }

        return listOfIndex(arr, target, index+1, ls);

    }

    // new approach
    static ArrayList<Integer> listOfIndex_new(int arr[], int target, int index){
        ArrayList<Integer> ls = new ArrayList<>();
        if(index == arr.length){
            return ls;
        }

        // this will contains ans from that function call only
        if(arr[index] == target){
            ls.add(index);
        }


        ArrayList<Integer> ansFromBelowCells = listOfIndex_new(arr, target, index+1);
        ls.addAll(ansFromBelowCells);

        return ls;

    }
}
