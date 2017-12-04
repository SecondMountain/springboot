package com.example;

import com.example.config.MysqlProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@MapperScan("com.example.mapper")

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.mapper"})
//@EnableConfigurationProperties(MysqlProperties.class)
public class SpringbootApplication {
	@Value("${hello}")
	private String hello;

	@Resource
	MysqlProperties mysqlProperties;

	@RequestMapping("/")
	String name(){
		return mysqlProperties.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
