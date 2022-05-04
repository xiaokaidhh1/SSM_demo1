package com.kai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadFile {
    @ResponseBody
    @RequestMapping("/uploadfile.do")
    public ModelAndView upload(MultipartFile photo) throws IOException {
        ModelAndView mv = new ModelAndView();
        File tarGetfile = new File("D:/JavaProject/Upload");
        if(!tarGetfile.exists()){
            tarGetfile.mkdirs();
        }
        photo.transferTo(new File(tarGetfile,photo.getOriginalFilename()));
        String message = "文件"+photo.getOriginalFilename()+"上传成功";
        mv.addObject("tips",message);
        mv.setViewName("uploadResult");
        return mv;
    }

}
