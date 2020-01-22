package jp.ac.uryukyu.ie.e195764;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Reviewクラス: 「英単語を覚える」が入力された時のプログラム
 */
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

    /**
     * AllayListの全要素を出力するメソッド
     * 英単語と意味を覚える際に利用する。
     */
    public void reviewWords() {
        for(String wordslist : words) {
            System.out.println(wordslist);
        }
        return;
    }

    /**
     * AllayListの全要素から英単語のみを出力するメソッド
     * 未実装
     */
    public void reviewEnglishWords() {
    }
}
