package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home/index")
	public String index(Model model) {
		model.addAttribute("message", "좋은 아침");
		model.addAttribute("now",new Date());
		return "home/index";
//		액션메서드가 리턴하는 값을 뷰 파일의 이름
//		액션메서드가 리턴한 이름의 뷰 파일이 실행된다.
	}

	@RequestMapping("home/test1")
	public String test(Model model) {
		model.addAttribute("myname", "방미리");
		return "home/test1";
	}
}
