package com.board.controller;

import org.springframework.stereotype.Controller; // 디스패처 서블릿에 com 추가했기때문에 컨트롤러인식
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/common/*")
public class CommonController {

	
	@GetMapping("main")
	public void main() { // 돌아감
		
	}
	
	/*
	@RequestMapping("main") // 돌아감
	public String main() {
		
		return "/common/main";
	}
	*/
	
	/*
	@RequestMapping("main") // 돌아감
	public void main() {
		
	}
	*/
	
	/*
	@RequestMapping("main")
	public ModelAndView main(ModelAndView mav) { // 돌아감
		mav.setViewName("/common/main");
		
		return mav;
	}
	*/
	
	
	/*
	@RequestMapping("/common/main")
	public ModelAndView main(ModelAndView mav) { // 돌아감
		mav.setViewName("/common/main");
		
		return mav;
	}
	*/
	
}
