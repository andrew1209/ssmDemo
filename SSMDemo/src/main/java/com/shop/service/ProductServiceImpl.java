package com.shop.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductMapper;
import com.shop.domain.Product;
import com.shop.domain.ProductExample;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productmapper;

	
	
	public List<Product> getProductList() {
		
		ProductExample  example = new ProductExample();
		//List<Product> list = productmapper.selectByExample(example);
		
		List<Product> list = productmapper.selectByExampleWithBLOBs(example);
		return list;
	}

}
