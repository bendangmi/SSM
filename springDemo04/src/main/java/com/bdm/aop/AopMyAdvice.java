package com.bdm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-21:13
 */
@Component
public class AopMyAdvice {
    // *单个独立的任意符号，可以独立出现，也可以作为前缀或者后缀的匹配符
    // execution(public * com.bdm.*.UserService.find*(*))
    // ..多个连续的任意符号，可以独立出现，常用于简化包名与参数的书写
    // execution(public User com..UserService.findById(..))
    @Pointcut("execution(void com.bdm.dao.BookDao.update())")
    private void pt(){}

    // 前置通知
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    // 后置通知
    @After("pt())")
    public void after(){
        System.out.println("after ...");
    }

    // 环绕通知 重点
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕的前置通知");
        final Signature signature = pjp.getSignature();
        // 获取全类包名
        final String className = signature.getDeclaringTypeName();
        final String name = signature.getName();
        // 获取切点方法名

        long start = System.currentTimeMillis();
        // 表示对原始操作的调用
        int j = 0;
        for (int i = 0; i < 10000; i++) {

            j++;
        }
        System.out.println("环绕的后置通知");
        long end = System.currentTimeMillis();
        System.out.println(className + "." + name + ":" + "万次执行时间:" + (end - start) + "ms");
        return null;
    }
}
