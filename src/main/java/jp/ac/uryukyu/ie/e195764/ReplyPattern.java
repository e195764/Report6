package jp.ac.uryukyu.ie.e195764;

/**
 * 応答用データベース
 * report2を参考にした
 */
public class ReplyPattern {
    String pattern;
    private String reply;

    /**
     * コンストラクタ: フィールドの初期化
     * @param pattern
     * @param reply
     */
    public ReplyPattern(String pattern, String reply){
        this.pattern = pattern;
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }

    /**
     * 引数と合致するかを確認するメソッド。
     *  case 1: 合致するなら true を返す。
     *  case 2: 上記以外なら false を返す。
     */
    public boolean equals(String pattern){
        return this.pattern.equals(pattern);
    }
}