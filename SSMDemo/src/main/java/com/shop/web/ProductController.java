package com.shop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.domain.Product;
import com.shop.service.ProductService;

@Controller
public class ProductController{
	@Autowired
	private ProductService productservice;
	@RequestMapping(value="/product")
    public ModelAndView getList()
    {
	
        List<Product> list = productservice.getProductList();	
    
    	ModelAndView  mv = new ModelAndView();
    	mv.setViewName("productList");  // 逻辑视图(假的)    物理视图  （/WEB-INF/productList.jsp）
    
    	// addObject(String key,Object Value)  =>该用法和request用户一样
    	
    	mv.addObject("productList", list);
    	
    	return mv;
    

      
      
    }
}
