package jp.ac.uryukyu.ie.e195764;

import java.util.Scanner;

/**
 * Testクラス: 「英単語をテストする」が選択された時のプログラム
 */
public class Check {
    ReplyPattern[] patterns;

    /**
     * コンストラクタ
     * @param dataset 応答パターン(String配列)。
     */
    public Check(String[] dataset){
        patterns = new ReplyPattern[dataset.length];
        for(int i = 0; i < dataset.length; i++) {
            String[] splitDataset = dataset[i].split("\t");
            patterns[i] = new ReplyPattern(splitDataset[0], splitDataset[1]);
        }
    }

    /**
     * 入力された英単語のスペルが一致するか判定するメソッド
     * スペルが一致しない場合，try-catchで「スペルミス」と出力するようにした
     *
     * @exception ArrayIndexOutOfBoundsException
     */
    public void checkWords() {
        String input, reply;
        Scanner in = new Scanner(System.in);
        while ( true ) {
            System.out.println("＜覚えた英単語を入力しなさい。＞");
            try{
                input = in.nextLine();
                reply = reply(input);
                System.out.println(reply);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("スペルミス");
            }
        }
    }

    /**
     * ユーザ入力に応じた応答を生成するメソッド
     * report2を参考にした
     *
     * @param pattern ユーザ入力
     * @return 応答文
     */
    public String reply(String pattern){
        int index = searchPattern(pattern);
        String message = "「" + patterns[index].reply + "」";
        return message;
    }

    /**
     * patternとユーザ入力が一致するか判定するメソッド
     * report2を参考にした
     *
     *  case 1: 見つかったら、該当インデックスを返す
     *  case 2: 見つからない場合には -1 を返す
     *
     * @param pattern 探す対象
     * @return インデックス
     */
    public int searchPattern(String pattern) {
        int j;
        for (j = 0; j < this.patterns.length; j++) {
            if (this.patterns[j].equals(pattern)) {
                return j;
            }
        }
        return -1;
    }
}