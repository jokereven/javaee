package pers.jokereven.javaee.ink;

/**
 * @author jokereven
 * @date 2022/3/25
 * @Description: 定义墨盒接口
*/

public interface Ink {

    public default String getColor(int r, int g, int b){
        return null;
    }
}
