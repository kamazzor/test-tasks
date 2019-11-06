package ru.softlinetasks;

import java.util.Arrays;


public class Tasks {
    public static void main(String[] args) {
        System.out.println(countWords("  43  12 445   sds "));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{2, 1, 4, 2, 3})));
    }

    public static int countWords(String s) {
        return s.trim().split(" +").length;
    }

    public static int[] removeDuplicates(int[] a) {
        return Arrays.stream(a).distinct().toArray();
    }
}
