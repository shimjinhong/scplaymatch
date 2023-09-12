package com.match.scplaymatch;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/html/1.do", method = RequestMethod.GET)
	public String htmlBlog(Locale locale, Model model) {
		logger.info("/html/blog.do");
		
		return "html/blog";
	}

	@RequestMapping(value = "/html/2.do", method = RequestMethod.GET)
	public String htmlBlogDtl(Locale locale, Model model) {
		logger.info("/html/blog.do");
		
		return "html/blog-details";
	}	
	
	@RequestMapping(value = "/html/3.do", method = RequestMethod.GET)
	public String htmlCheckout(Locale locale, Model model) {
		logger.info("/html/checkout.do");
		
		return "html/checkout";
	}
	
	@RequestMapping(value = "/html/4.do", method = RequestMethod.GET)
	public String htmlContact(Locale locale, Model model) {
		logger.info("/html/contact.do");
		
		return "html/contact";
	}
	
	@RequestMapping(value = "/html/5.do", method = RequestMethod.GET)
	public String htmlmain(Locale locale, Model model) {
		logger.info("/html/main.do");
		
		return "html/main";
	}		
	
	@RequestMapping(value = "/html/6.do", method = RequestMethod.GET)
	public String htmlShopDtl(Locale locale, Model model) {
		logger.info("/html/shopDtl.do");
		
		return "html/shop-details";
	}
	
	@RequestMapping(value = "/html/7.do", method = RequestMethod.GET)
	public String htmlShopGrid(Locale locale, Model model) {
		logger.info("/html/shopGrid.do");
		
		return "html/shop-grid";
	}
	
	@RequestMapping(value = "/html/8.do", method = RequestMethod.GET)
	public String htmlShopCart(Locale locale, Model model) {
		logger.info("/html/shopCart.do");
		
		return "html/shoping-cart";
	}		
	
}
