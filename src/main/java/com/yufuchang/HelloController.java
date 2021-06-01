package com.yufuchang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yufuchang on 2020/7/31.
 */
@RestController
public class HelloController {

    @Value("${my.name}")
    String name;

    @Value("${my.age}")
    int age;

    @Autowired
    MyInfoBean myInfoBean;

    @Autowired
    MyInfoBeanTestProperties myInfoBeanTestProperties;

    /**
     *  直接读取
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return name + "欢迎你！" + "我的年龄是："+age;
    }

    /**
     * 先注入到实体再读取
     * @return
     */
    @GetMapping("/hello_bean")
    public String helloBean(){
        return "name:"+myInfoBean.getName() +"age:"+myInfoBean.getAge();
    }


    /**
     * 先注入到实体再读取，配置到其他文件
     * @return
     */
    @GetMapping("/hello_properties_bean")
    public String helloPropertiesBean(){
        System.out.print("age:"+myInfoBean.getAge());
        return "name:"+myInfoBean.getName() +"age:"+myInfoBean.getAge();
    }
}
