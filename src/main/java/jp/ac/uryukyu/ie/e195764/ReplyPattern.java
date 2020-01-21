package jp.ac.uryukyu.ie.e195764;

public class ReplyPattern {
    String pattern;
    String reply;


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