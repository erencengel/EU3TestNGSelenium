package com.cybertek.tests.replit;

import java.util.Arrays;

public class printShortest {
    public static void main(String[] args) {
        /*
        Write a program that will find out shortest words in the given string str.
        If there are few words that are evenly short, print them all.
        Use split method in order to split str string variable and create an array of strings.
        Print array with Arrays.toString() method. Sort array before printing.
        > Hint: Split values by comma: split(", ");
        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        output: [cat, old, ray]
         */
        System.out.println(Arrays.toString(method(" olive, fish, pursuit, old, warning, phyton, java, coffee, cat, ray")));
        System.out.println(Arrays.toString(method("baca,kutu,saat,alperen")));
        System.out.println(Arrays.toString(method(" How, old, are, you, guys?, How, is, it, going ?")));
    }

    public static String[] method(String str) {
        String[] array = str.split(",");
        String min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
        }
        int a = min.length();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == a) {
                count++;
            }
        }
        int finalnumber = count;
        String[] newarray = new String[finalnumber];

        int j=0;
        for(int i=0;i< array.length;i++){
            if(array[i].length()==a){
                newarray[j]=array[i].trim();
                j++;
            }
        }
        Arrays.sort(newarray);
        return newarray;
    }
}
