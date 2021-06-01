package com.yufuchang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by yufuchang on 2020/7/31.
 */
@Configuration
@PropertySource("classpath:test.properties")
public class MyInfoBeanTestProperties {

    @Value("${my.name}")
    String name;
    @Value("${my.age}")
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Bean
    public MyInfoBean dataSource() {
        MyInfoBean myInfoBean = new MyInfoBean();
        myInfoBean.setAge(age);
        myInfoBean.setName(name);
        return myInfoBean;
    }
}
