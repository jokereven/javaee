package pers.jokereven.javaee.paper;

public interface Paper {
//    1. 换行
    public static final String LineFeed = "\r\n";
//    2. 输出字符到纸上
    public void Output(char s);
//    3. 得到不同纸张的内容效果
    public String GetContent();
}
