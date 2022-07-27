package com.match.scplaymatch;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.match.scplaymatch.dto.Test;
import com.match.scplaymatch.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	TestService cartServiceImpl;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
				
		return "redirect:index.do";
	}
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("carts", cartServiceImpl.selectCart()); // carts라는 값에 카트에 담겨있는 물건을 데이터베이스에서 가져와 저장
		System.out.println("cartServiceImpl.selectCart() >>" + cartServiceImpl.selectCart().get(0).getName());
		return "index";
	}	
	
	@RequestMapping(value = "/insertCarts", method = RequestMethod.POST)
	public String insertCarts(Test test) {
		logger.info("insertCarts");
		
		cartServiceImpl.insertCart(test); // 카트에 담길 데이터 저장
		return "redirect:index.do";
		
	}	
	
	
	
}
