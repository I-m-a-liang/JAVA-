package com.edu.holypearl.users.controller.user.UserController;


import com.edu.holypearl.users.domain.entity.CommonResult;
import com.edu.holypearl.users.domain.entity.User;
import com.edu.holypearl.users.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/user/create")
    public CommonResult create(User user){
        int result = userService.create(user);
        System.out.println("******插入结果: " + result);
        if (result >0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return  new CommonResult(444,"插入数据库失败 ",null);
        }
    }

    @GetMapping(value = "/user/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        System.out.println("******查询结果: " + user);
        if (user != null){
            return new CommonResult(200,"查询成功",user);
        }else {
            return  new CommonResult(444,"没有对应记录，查询失败 "+id,null);
        }
    }
}
