package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
//	@Autowired
//	private UserDAO userDao;

	@RequestMapping("/hello")
	public ModelAndView fun() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
//	
//	 @RequestMapping("/saveUser")
//	    public String saveUser(@ModelAttribute("user") User user) {
//		 userDao.save(user);
//	        return "redirect:/hello";
//	    }
//	
//	

}
