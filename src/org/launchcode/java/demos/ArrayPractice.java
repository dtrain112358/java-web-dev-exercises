package org.launchcode.java.demos;

import java.util.Arrays;






public class ArrayPractice {

    public static void main(String[] args) {
        int[] arrayNums = {1, 1, 2, 3, 5, 8};

                for (int i = 0; i < 6; i++) {

                    System.out.println(i);
                }

                String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat" +
                        "then in a house. I will not eat them with a mouse";
                String [] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat" +
                "then in a house. I will not eat them with a mouse";
        words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));
    }


}
