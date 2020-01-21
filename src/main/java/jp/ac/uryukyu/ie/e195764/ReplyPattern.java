package jp.ac.uryukyu.ie.e195764;

public class ReplyPattern {
    String pattern; //botへの想定入力
    String reply; //想定入力に対応する応答文

    //コンストラクタ
    public ReplyPattern(String pattern, String reply){
        this.pattern = pattern;
        this.reply = reply;
    }


    public void print(){
        System.out.println("pattern: " + pattern);
        System.out.println("reply: " + reply);
    }


    public boolean equals(String pattern){
        return this.pattern.equals(pattern);
    }
}