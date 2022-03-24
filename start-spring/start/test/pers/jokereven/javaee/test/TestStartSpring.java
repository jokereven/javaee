package pers.jokereven.javaee.test;

import org.junit.Test;
import pers.jokereven.javaee.entity.StartSpring;

public class TestStartSpring {

    @Test
    public void test(){
        StartSpring startSpring = new StartSpring();
        startSpring.setWho("joker even");
        startSpring.hello();
    }
}
