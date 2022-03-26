package pers.jokereven.javaee.ink;

import java.awt.*;

/**
 * @author jokereven
 * @date 2022/3/25
 * @Description: 实现接口Ink的方法
 * 黑色墨盒
*/

public class GreyInk implements Ink{

    @Override
    public String getColor(int r, int g, int b) {
        int c = (r+g+b)/3;
        Color color = new Color(c,c,c);
//        color to # 16进制
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
