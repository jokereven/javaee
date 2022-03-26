package pers.jokereven.javaee.ink;

import java.awt.*;

/**
 * @author jokereven
 * @date 2022/3/25
 * @Description: 实现接口Ink的方法
 * 彩色墨盒
*/

public class ColorInk implements Ink {

    @Override
    public String getColor(int r, int g, int b) {
        Color color = new Color(r,g,b);
//        color -> # 进制
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
