package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first) {
            result = second;
        }
        if (third > first) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ThreeMax.max(10, 14, 1));
    }
}
