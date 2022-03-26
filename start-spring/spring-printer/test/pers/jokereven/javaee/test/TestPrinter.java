package pers.jokereven.javaee.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jokereven.javaee.printer.Printer;

import java.io.PrintWriter;

public class TestPrinter {
    @Test
    public void test() {
//        通过spring 的上下文 context 对象 读取配置文件
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Printer
        Printer printer = (Printer)  ctx.getBean("printer");

        String str = "旗木卡卡西（はたけカカシ，Ha take Takashi）是由岸本齐史创作的日本动漫《火影忍者》中的虚构角色。故事中为第七班的老师，该班由系列主角漩涡鸣人、宇智波佐助及春野樱组成。最初他被描绘成一个冷漠的人；随着剧情的发展，他对朋友和学生的忠诚越来越明显。系列剧情与外传都有对卡卡西过去经历的广泛探索。卡卡西曾出现在多部火影忍者的跨媒体作品、动漫改编电影、原创动画录像带（OVA）及电子游戏中"+
                "最初岸本想把卡卡西塑造成一位严厉的老师且说的话很像忍者，最终决定不采用这个构想；相反地，岸本使卡卡西在困境中更加慷慨地让学生冷静下来，以至于赋予他阴柔特质。卡卡西把脸遮住的设计，使岸本很难表现他的情绪。在动画系列中，卡卡西的日语配音和英语配音分别由井上和彦与Dave Wittenberg负责。" +
                "许多动漫与漫画出版商都赞扬及批评了卡卡西的性格。虽被认为是类似少年漫画中超然人物的表现，卡卡西冷漠与严肃的两面性还是受到称赞。卡卡西在火影忍者读者群中非常受欢迎，在多项人气民意调查中名列前茅，还发行了基于卡卡西的多种商品，包括钥匙圈和布偶。";
//        printer
        printer.print(str);
        }
}
