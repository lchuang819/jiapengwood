package com.jiapengwood.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jiapengwood.model.Product;
import com.jiapengwood.service.ProductService;

@Controller
public class ProductController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductService productService;

	@ResponseBody
	@RequestMapping(value = "/fetchProductList", method = RequestMethod.GET, produces="application/json; charset=UTF-8")
	public List<Product> fetchProductList() {

		return productService.fetchProductList();

	}
	
	@RequestMapping(value = "/fetchProduct/{proudctId}", method = RequestMethod.GET, produces="application/json; charset=UTF-8")
	public ModelAndView fetchProductList(@PathVariable String proudctId) {

		ModelAndView mav = new ModelAndView("redirect:/product.html");
		
		return mav;

	}
	
}
