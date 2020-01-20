package jp.ac.uryukyu.ie.e195764;
import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("選択してください。");
        System.out.println("・英単語テストをする ---> a");
        System.out.println("・英単語を復習する ---> b");
        System.out.println("・リストに単語を追加する ---> c");
        System.out.println("（入力待ち）");


        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();

        Review review = new Review();
        Addition addition = new Addition();


        if (a.equals("a")) {
            //実装


        } else if (a.equals("b")) {
            //実装
            review.reviewWords();


        } else if (a.equals("c")) {
            //実装
            addition.addWords();


        } else {
            System.out.println("正しく入力してください。");
        }

    }

}
