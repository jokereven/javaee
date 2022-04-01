package pers.jokereven.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

// 注解切面
@Aspect
public class UserAddAop {
    private static final Logger logger = Logger.getLogger(UserAddAop.class);

//    创建切入点
//    匹配所有参数
    @Pointcut("execution(* pers.jokereven.service.UserService.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint jp){
        /*
         * JoinPoint : 接入点,增强的方法
         * jp.getTarget() : 目标方法所在的类文件
         * jp.getSignature() : 目标方法的对象
         * jp.getArgs() : 目标方法传入的参数对象
         * Arrays.toString : 将数组转化为字符串
         * */
        logger.debug("前增强"+jp.getTarget()+"的"
                +jp.getSignature().getName()
                +"方法,方法的参数是:"
                + Arrays.toString(jp.getArgs()));
    }

    //后增强方法
    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void after(JoinPoint jp,Object result){
        logger.debug("后增强"+jp.getTarget()+"的"
                +jp.getSignature().getName()
                +"方法,方法的结果是:"
                + result);
    }
}
