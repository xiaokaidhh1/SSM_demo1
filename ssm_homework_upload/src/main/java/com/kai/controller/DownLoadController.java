package com.kai.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
@Controller
public class DownLoadController {
    @GetMapping("/downloadfiles")
    public String showFileList(HttpServletRequest req, Model model) throws Exception{
        //得到downloads目录的路径
        String filePath = req.getServletContext().getRealPath("/downloads/");
        System.out.println(filePath);
        //得到文件列表
        File[] files = new File(filePath).listFiles();
        //下载连接列表
        List<String> downLinks = new ArrayList<>();
        List<String> downNames = new ArrayList<>();
        for(File file:files){
            downLinks.add("downLoad?fileName="+ URLEncoder.encode(file.getName(),"UTF-8"));
            downNames.add(file.getName());
            System.out.println(file.getName());
        }
        model.addAttribute("links",downLinks);
        model.addAttribute("names",downNames);
        return  "download";
    }

    @RequestMapping("/downLoad")
    public ResponseEntity<byte[]> downLoad(String fileName, HttpServletRequest req) throws Exception{
        //得到downloads目录的路径
        String filePath = req.getServletContext().getRealPath("/downloads/");
        //拼接文件名完整路径
        filePath = filePath + File.separator+fileName;
        //创建BodyBuilder,用于构造ResponseEntity对象，建造者模式的应用
        ResponseEntity.BodyBuilder builder = ResponseEntity.ok();
        //设置响应内容类型为二进制流
        builder.contentType(MediaType.APPLICATION_OCTET_STREAM);
        //文件名utf-8编码  ，防止乱码,设置Content-Disposition，设置下载时的默认文件名
        fileName = URLEncoder.encode(fileName,"UTF-8");
        builder.header("Content-Disposition","attachment;filename*=UTF-8''"+fileName);
        //将文件生成为下载用的二进制ResponseEntity对象
        ResponseEntity<byte[]> resEntity =  builder.body(FileUtils.readFileToByteArray(new File(filePath)));

        //返回 二进制ResponseEntity对象
        return resEntity;
    }
}
