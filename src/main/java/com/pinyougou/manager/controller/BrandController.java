package com.pinyougou.manager.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController  
@RequestMapping("/brand")
public class BrandController {

	@Reference    //引用注解
	private BrandService brandService;
	
	
	@RequestMapping("findAll")
	public List<TbBrand> findAll(){
		System.out.println("16546");
		return brandService.findAll();
		
	}
}
