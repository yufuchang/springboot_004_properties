package com.yufuchang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot004PropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot004PropertiesApplication.class, args);

		//注意如果application.properties和test.properties中存在相同的my.name等配置，系统会以application.properties为准。
	}

}
