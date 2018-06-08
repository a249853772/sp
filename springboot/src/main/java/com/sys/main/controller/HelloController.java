package com.sys.main.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/test")
	public String test(Model m){
		m.addAttribute("now", DateFormat.getInstance().format(new Date()));
		return "test";
	}
	
	/*@RequestMapping("/index")
	public String index(Model m){
//		m.addAttribute("now", DateFormat.getInstance().format(new Date()));
		return "index";
	}*/
	
	@RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

}
