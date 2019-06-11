package aspect;

import cucumber.api.java.cs.A;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 中介商
 */
//@Component
//@Aspect
public class Broker {

//    @Pointcut("execution(* pojo.Landlord.service())")
//    public void lService(){
//
//    }

//    @Before("execution(* pojo.Landlord.service())")
    /*@Before("lService()")
    public void before(){
        System.out.println("带租客看房");
        System.out.print("谈价格");
    }

//    @After("execution(* pojo.Landlord.service())")
    @After("lService()")
    public void after(){
        System.out.println("交钥匙");
    }*/

//    @Around("exe")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("带租客看房");

        try {
            joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }


        System.out.println("谈价格");
        System.out.println("交钥匙");
    }



}





