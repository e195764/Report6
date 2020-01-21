package jp.ac.uryukyu.ie.e195764;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Review {

    ArrayList<String> words = new ArrayList<>(Arrays.asList(
            "merchant\t商人",
            "needle\t針",
            "oxygen\t酸素",
            "diplomacy\t外交",
            "rainfall\t降雨",
            "structure\t構造",
            "herbivore\t草食動物",
            "lava\t溶岩",
            "investment\t投資",
            "fireplace\t暖炉"));


    public void reviewWords() {
        for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
        return;
    }

    public void reviewEnglishWords() {
    }
}
