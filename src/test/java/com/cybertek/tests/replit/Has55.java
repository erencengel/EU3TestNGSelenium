package com.cybertek.tests.replit;

import java.util.Arrays;

public class Has55 {
    /*
    Given an array **nums**, print `true` if the array contains a 5 next to a 5 anywhere in the array.
    If no consecutive 5s or no 5s are detected in your code then print `false`.
    nums → [1, 5, 5, 1, 1] → true
    nums → [1, 8, 5, 5, 0] → true
    nums → [1, 5, 4, 1, 5] → false
    nums → [1, 4, 4, 1, 99] → false
     */
    public static void main(String[] args) {

        int[]nums = {1,5,5,1,1};
        int[]nums2 = {1,8,5,5,0};
        int[]nums3 = {1,5,4,1,5};
        int[] nums4 = {1,4,4,1,99};
        System.out.println(getBoolean(nums));
        System.out.println(getBoolean(nums2));
        System.out.println(getBoolean(nums3));
        System.out.println(getBoolean(nums4));

        String str = "how are you";
        String[] ar = str.split(" ");
        System.out.println(Arrays.toString(ar));

    }

    public static boolean getBoolean(int[]array){
        for(int i=0;i<=array.length-2;i++){
            if(array[i]==5 && array[i+1]==5){
                return true;
            }
        }
        return false;
    }


}
