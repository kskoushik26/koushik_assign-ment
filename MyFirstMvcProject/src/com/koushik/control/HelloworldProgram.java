package com.koushik.control;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloworldProgram {

@RequestMapping("/welcome")
public ModelAndView hello() {
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World!!!!!!!!!");
		return model;
	}
}