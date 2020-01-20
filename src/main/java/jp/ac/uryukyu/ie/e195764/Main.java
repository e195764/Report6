package jp.ac.uryukyu.ie.e195764;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("選択してください。");
        System.out.println("・英単語テストをする。");
        System.out.println("・英単語を復讐する。");
        System.out.println("・リストに単語を追加する。");
        System.out.println("（入力待ち）");
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine();


        if (a == "・英単語テストをする。") {
            //実装
            return;
        } else if (a == "・英単語を復讐する。") {
            //実装
            return;
        } else if (a == "・リストに単語を追加する・") {
            //実装
            return;
        } else {
            System.out.println("正しく入力してください。");
        }


    }
}
