package ru.softlinetasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestTasks {

    @Test
    public void countWords() {
        String s = "  43  12 445   sds ";
        Assert.assertTrue(s.trim().split(" +").length == 4);
    }

    @Test
    public void removeDuplicates() {
        int[] a = {2, 1, 4, 2, 3};
        int[] rightA = {2, 1, 4, 3};
        int[] aWithoutDupl = Arrays.stream(a).distinct().toArray();
        Assert.assertTrue(aWithoutDupl.length == 4 &&
                Arrays.equals(aWithoutDupl, rightA));
    }
}