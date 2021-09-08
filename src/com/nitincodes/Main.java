package com.nitincodes;

import java.util.Arrays;

// java program to swap two of the elements in an array
public class Main {

    public static void main(String[] args) {
        int[] arr = {1,4,8,3,9,23};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
