package com.kai.handler;

import org.apache.log4j.MDC;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyIntercepter implements HandlerInterceptor {

    //登录拦截验证
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        System.out.println("登录拦截验证方法");
        Object attr = request.getSession().getAttribute("user");
        if (attr != null) {
            return true;
        }
        else
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        return false;
    }


}
