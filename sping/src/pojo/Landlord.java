package pojo;

import org.springframework.stereotype.Component;

/**
 * 包租婆
 */
//@Component("landlord")
public class Landlord {

    public void service(){
        //包租婆的核心业务功能
        System.out.println("签合同");
        System.out.println("收房租");
    }
}
