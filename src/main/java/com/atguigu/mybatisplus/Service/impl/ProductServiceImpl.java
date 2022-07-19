package com.atguigu.mybatisplus.Service.impl;

import com.atguigu.mybatisplus.Service.ProductService;
import com.atguigu.mybatisplus.mapper.ProductMapper;
import com.atguigu.mybatisplus.pojo.Product;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService{
}
