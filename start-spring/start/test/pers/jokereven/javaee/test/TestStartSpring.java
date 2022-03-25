package pers.jokereven.javaee.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jokereven.javaee.entity.StartSpring;

public class TestStartSpring {

    @Test
    public void test(){
        StartSpring startSpring = new StartSpring();
        startSpring.setWho("joker even");
        startSpring.hello();
    }

    @Test
    public void TestSpringStart(){
//        通过spring 的上下文 context 对象 读取配置文件
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        使用ctx直接获取spring容器的对象
//        getBean获取容器对象
       StartSpring startSpring = (StartSpring) ctx.getBean("startSpring");
       startSpring.hello();
    }
}
