package com.liuyt.pro.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.liuyt"})
public class SysStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysStarterApplication.class, args);
	}

}
