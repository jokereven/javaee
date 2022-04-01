package pers.jokereven.aop.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.lang.reflect.Array;
import java.util.Arrays;

//用于编写针对某些方法进行前后增强的业务
public class UserSaveAop {

    private static final Logger log = Logger.getLogger(UserSaveAop.class);

    //前增强方法
    public void before(JoinPoint jp){
        /*
         * JoinPoint : 接入点,增强的方法
         * jp.getTarget() : 目标方法所在的类文件
         * jp.getSignature() : 目标方法的对象
         * jp.getArgs() : 目标方法传入的参数对象
         * Arrays.toString : 将数组转化为字符串
         * */
        log.debug("前增强"+jp.getTarget()+"的"
                +jp.getSignature().getName()
                +"方法,方法的参数是:"
                + Arrays.toString(jp.getArgs()));
    }

    //后增强方法
    public void after(JoinPoint jp,Object result){
        log.debug("后增强"+jp.getTarget()+"的"
                +jp.getSignature().getName()
                +"方法,方法的结果是:"
                + result);
    }
}
