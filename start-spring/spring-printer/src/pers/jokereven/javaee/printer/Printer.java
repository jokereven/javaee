package pers.jokereven.javaee.printer;

import pers.jokereven.javaee.ink.Ink;
import pers.jokereven.javaee.paper.Paper;

public class Printer {
    private Ink ink; // 墨盒

    private Paper paper;// 纸张

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

//    打印内容
    public void print(String str){
        System.out.println("正在使用"+ ink.getColor(255,255,255)+"的颜色打印内容");
//        for 循环打印内容
        for (int i = 0; i < str.length(); i++) {
//            把每一个字符放到纸张中
            paper.Output(str.charAt(i));
        }
//        show
        System.out.println(paper.GetContent());
    }
}
