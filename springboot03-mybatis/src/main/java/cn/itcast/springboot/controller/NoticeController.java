package cn.itcast.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itcast.springboot.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/show")
	public String notice(){
		return "html/notice.html";
	}
	
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam(value="page",defaultValue="1",required=false)Integer page,
			@RequestParam(value="rows",defaultValue="5 	",required=false)Integer rows){
		System.out.println(page+rows);
		Map<String, Object>  data = noticeService.findAll(page,rows);
		return data;
	}
	
}
