package com.kai.controller;

import com.alibaba.druid.stat.TableStat;
import com.kai.pojo.User;
import com.kai.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //登录
    @RequestMapping("/login.do")
    public ModelAndView login(User user, HttpSession session){
        ModelAndView mv = new ModelAndView();
        int nums = userService.login(user);

        String tips = "登录失败！";
      if(user.getUsername()!=null&&nums>0){
          tips = "用户【" + user.getUsername() + "】登录成功！";
          session.setAttribute("user", user);
          mv.addObject("tips", tips);
          mv.setViewName("userlist");
      }
      else {mv.addObject("tips",tips);
      mv.setViewName("success");}
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

    //用户列表
    @RequestMapping("/userlist.do")
    @ResponseBody
    public List<User> userlist2(){
        List<User> users =userService.userlist();
        return users;
    }


    //退出
    @RequestMapping("/logout.do")
    public ModelAndView logout(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("tips", "退出成功！");
        session.removeAttribute("user");
        mv.setViewName("success");
        return mv;
    }

}
