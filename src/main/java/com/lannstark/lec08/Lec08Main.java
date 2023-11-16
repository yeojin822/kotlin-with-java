package com.lannstark.lec08;

public class Lec08Main {

    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        printAll(array);

        printAll("A", "B", "C");
    }
    // 가변인자
    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    //오버로딩
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }
}
