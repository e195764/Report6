package jp.ac.uryukyu.ie.e195764;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dataset = {"merchant\t商人",
                "needle\t針",
                "oxygen\t酸素",
                "diplomacy\t外交",
                "rainfall\t降雨",
                "structure\t構造",
                "herbivore\t草食動物",
                "lava\t溶岩",
                "investment\t投資",
                "fireplace\t暖炉"};

        System.out.println("選択してください。");
        System.out.println("・英単語を覚える ---> a");
        System.out.println("・英単語をテストする ---> b");
        System.out.println("・リストに単語を追加する ---> c");
        System.out.println("プログラムを終了する ---> !");
        System.out.println("（入力待ち）");

        Review review = new Review();
        Addition addition = new Addition();
        Test test = new Test(dataset);

        while( true ) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            if (a.equals("a")) {
                review.reviewWords();
                System.out.println("（入力待ち）");
            } else if (a.equals("b")) {
                test.testWords();
                System.out.println("（入力待ち）");
            } else if (a.equals("c")) {
                addition.addWords();
                System.out.println("単語を追加しました。（入力待ち）");
            } else if(a.equals("!")) {
                break;
            }else{
                System.out.println("正しく入力してください。");
                System.out.println("（入力待ち）");
            }
        }
    }
}
