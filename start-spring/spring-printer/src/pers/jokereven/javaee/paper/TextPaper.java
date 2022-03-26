package pers.jokereven.javaee.paper;

/**
 * @author jokereven
 * @date 2022/3/25
 * @Description: 纸张的实现
*/

public class TextPaper implements Paper{
//    纸张有不同的大小
//    每行的字符
    private int Aline = 14;
//    每页的行数
    private int HowRows = 10;
//    纸当中的内容
    private String Content = "";
//    横向文件的位置 0 -> ALine - 1
    private int PlaceX = 0;
//    行数位置 0 -> HowRows - 1
    private int PlaceY = 0;
//    当前页数
    private int PageNow = 1;

//    区分 a4 and a5
    public int getAline() {
        return Aline;
    }

    public void setAline(int aline) {
        Aline = aline;
    }

    public int getHowRows() {
        return HowRows;
    }

    public void setHowRows(int howRows) {
        HowRows = howRows;
    }

    @Override
    public void Output(char s) {
//        文本内容累加
        Content += s;
        PlaceX++;
//        换行
        if (PlaceX == Aline){
//            换行方法
            Content += Paper.LineFeed;
            PlaceX = 0;
            PlaceY++;
        }
//        换页
        if (PlaceY == HowRows && PlaceX == Aline){
            Content += "*****第" + PageNow + "页****";
//            换行
            Content += Paper.LineFeed;
            Content += Paper.LineFeed;
            PlaceX = 0;
            PlaceY = 0;
            PageNow++;
        }
    }

    @Override
    public String GetContent() {
        String str = this.Content;
        str += Paper.LineFeed;
        str += "*****第" + PageNow + "页****";
        return str;
    }
}
