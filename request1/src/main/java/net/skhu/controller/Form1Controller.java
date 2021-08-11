package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//컨트롤러에는 어노테이션이 붙어있어야 한다.
//그렇지 않으면 404 Not Found
@Controller
public class Form1Controller {

	//"http://서버주소:포트번호/form1/text1" URL이 GET 방식으로 서버에 요청되면,
	// 이 액션 메소드가 자동으로 호출되어 실행
	@GetMapping("form/text1")
	public String text1(Model model) {
		return "form/text1";
	}

	//"http://서버주소:포트번호/form1/text1" URL이 POST 방식으로 서버에 요청되면,
	// 이 액션 메소드가 자동으로 호출되어 실행
	@PostMapping("form/text1")
	public String text1(Model model,String param1,String param2) {
		System.out.println(param1);
		System.out.println(param2);
		return "form/text1";
	}
}
