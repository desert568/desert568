package com.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("upload")
    public String upload(MultipartFile image, HttpServletRequest request) {

        //先输出一下文件的名字 类型 大小
        System.out.println(image.getOriginalFilename());
        System.out.println(image.getContentType());
        System.out.println(image.getSize());

        //获得服务器的路劲，将这个文件存到服务器上面去
        //String path=request.getSession().getServletContext().getRealPath("/")+"image";

        String path="D:/desert568/K/src/main/webapp/images";

        File file=new File(path+"/"+image.getOriginalFilename());
        System.out.println(file);

        try {
            FileUtils.copyInputStreamToFile(image.getInputStream(),file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sqlpath="images/"+image.getOriginalFilename();
        System.out.println("存入数据库的地址："+sqlpath);

        HttpSession session=request.getSession();
        session.setAttribute("image_path","images/h.jpg");

        return "success";
    }







}
