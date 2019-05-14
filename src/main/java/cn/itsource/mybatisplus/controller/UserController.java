package cn.itsource.mybatisplus.controller;

import cn.itsource.mybatisplus.domain.User;
import cn.itsource.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lzctuoxie
 * @version v1.0
 * @description: TODO
 * @date 2019/5/14
 * @ClassName:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService UserService;

    @RequestMapping("/list")
    public List<User> list(){
        return UserService.list();
    }
}
