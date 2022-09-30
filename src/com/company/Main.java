package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> left = new ArrayList<>(List.of(1, 7, 23));
        List<Integer> right = new ArrayList<>(List.of(2, 4, 7, 10, 11));
        List<Integer> list3 = new ArrayList<>();

        int leftPointer = 0;
        int rightPointer = 0;

        for (int i = 0; i < left.size() + right.size(); i++) {
            if (leftPointer == left.size() || rightPointer == right.size()) {
                list3.addAll(leftPointer == left.size() ? right.subList(rightPointer, right.size()) : left.subList(leftPointer, left.size()));
                break;
            }
            if (left.get(leftPointer).compareTo(right.get(rightPointer)) <= 0) {
                list3.add(left.get(leftPointer++));
            } else {
                list3.add(right.get(rightPointer++));
            }
        }
        System.out.println(list3);
    }

}

