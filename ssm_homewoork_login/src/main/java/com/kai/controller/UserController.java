package com.kai.controller;

import com.kai.pojo.User;
import com.kai.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //登录
    @RequestMapping("/login.do")
    public ModelAndView login(User user){
        ModelAndView mv = new ModelAndView();
        int nums = userService.login(user);
        String tips = "登录失败！";
      if(nums>0){
          tips = "用户【" + user.getUsername() + "】登录成功！";
          mv.addObject("tips", tips);
      }
      else mv.addObject("tips",tips);
      mv.setViewName("success");
        return mv;
    }

    //注册
    @RequestMapping("/register.do")
    public ModelAndView register(User user){
        ModelAndView mv = new ModelAndView();
        int nums = userService.register(user);
        String tips = "注册失败！";
        if(nums>0){
            tips = "用户【" + user.getUsername() + "】注册成功！";
            mv.addObject("tips", tips);
        }
        else mv.addObject("tips",tips);
        mv.setViewName("success");
        return mv;

    }

}
