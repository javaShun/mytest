package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	//注意包名是：org.springframework.core.env.Environment
	@Autowired
	private Environment enviroment;
	/*@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;*/

	//@RestController注解:其实就是@Controller和@ResponseBody注解加在一起
	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		System.out.println(enviroment.getProperty("name"));
		System.out.println(enviroment.getProperty("url"));
		/*System.out.println(name);
		System.out.println(url);*/
		return "hello springboot";
	}
	
	@GetMapping("/users")
	public String userhtml(){
		
		return "user.html";   
	}
}
