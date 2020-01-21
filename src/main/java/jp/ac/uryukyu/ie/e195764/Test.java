package jp.ac.uryukyu.ie.e195764;

import java.util.Random;
import java.util.Scanner;

public class Test {

    ReplyPattern[] patterns; //応答パターン

    public Test(String[] dataset){
        patterns = new ReplyPattern[dataset.length];
        for(int i = 0; i < dataset.length; i++) {
            String[] splitDataset = dataset[i].split("\t");
            patterns[i] = new ReplyPattern(splitDataset[0], splitDataset[1]);
        }
    }

    public void testWords() {
        String input, reply, output;
        Scanner in = new Scanner(System.in);
        while ( true ) {

            Random rand = new Random();

            System.out.println("（入力待ち）");
            input = in.nextLine();

            reply = reply(input);
            System.out.println(reply);
        }
    }


    public String reply(String pattern){
        int index = searchPattern(pattern);
        String message = "「" + patterns[index].reply + "」";
        return message;
    }


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