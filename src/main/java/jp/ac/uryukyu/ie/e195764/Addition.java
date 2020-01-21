package jp.ac.uryukyu.ie.e195764;

import java.util.Scanner;

/**
 * Additionクラス: 「英単語を追加する」が選択された時のプログラム
 */
public class Addition {

    /**
     * 英単語帳に新しくスペルとその意味を追加するメソッド
     */
    public void addWords() {
        System.out.println("追加したい英単語とその意味を書いてください。");

        System.out.println("英単語：");
        Scanner sc1 = new Scanner(System.in);
        String e = sc1.nextLine();

        System.out.println("意味：");
        Scanner sc2 = new Scanner(System.in);
        String j = sc2.nextLine();

        Review review = new Review();
        review.words.add(e + "\t" + j);

        return;
        //System.out.println(review.words); //確認用
    }

    /**
     * 単語帳から単語を削除するメソッド
     * 未実装
     */
    public void rmWords() {
        System.out.println("削除したい英単語とその意味を書いてください。");
    }
}
