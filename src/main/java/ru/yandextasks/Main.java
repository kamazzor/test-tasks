package ru.yandextasks;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
//        InputStream is =
        Scanner in = new Scanner("input.txt");

        System.out.println(in.nextInt() + in.nextInt());
    }

}
