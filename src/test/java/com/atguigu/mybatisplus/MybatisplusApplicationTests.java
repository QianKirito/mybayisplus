package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.Service.ProductService;
import com.atguigu.mybatisplus.Service.UserService;
import com.atguigu.mybatisplus.mapper.ProductMapper;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.Product;
import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    public void testSelectList(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age",20)
                .like("name","a")
                .or()
                .isNull("email");
        User user = new User();
        user.setName("小明");
        user.setEmail("test@guigu.com");
        int result = userMapper.update(user, queryWrapper);
        System.out.println("result:"+result);
    }

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,2);
        userMapper.selectPage(page,null);
        System.out.println(page);
    }

    @Test
    public void testEnum(){
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }

}
