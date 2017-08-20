package cn.itcast;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//代表springboot应用的运行主类	
public class Application {

	public static void main(String[] args) {
	/*	*//** 运行springBoot应用*//*
		SpringApplication.run(Application.class, args);*/
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置横幅模式(关闭)*/
		springApplication.setBannerMode(Banner.Mode.OFF);
		/**运行*/
		springApplication.run(args);
	}

}
