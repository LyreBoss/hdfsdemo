package com.demo.yun.controller;

import com.demo.yun.pojo.UserFile;
import com.demo.yun.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * 上传文件controller
 * Created by lyre on 2018/12/17
 **/
@RestController
@RequestMapping
public class UploadController {

    @Resource
    private  FileService fileService ;

    // 文件上传
    @RequestMapping("/fileUpload")
    @PostMapping
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        if (!file.isEmpty()) {
            String saveFileName = file.getOriginalFilename();
            File saveFile = new File(request.getSession().getServletContext().getRealPath("/upload/") + saveFileName);
            if (!saveFile.getParentFile().exists()) {
               boolean mk =  saveFile.getParentFile().mkdirs();
                System.out.println("mk result" + mk);
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();
                out.close();

                UserFile fileDto = new UserFile() ;
                fileDto.setFileSize((double) file.getSize());
                fileDto.setFileName(file.getName());
                fileDto.setFileType("default");
                fileDto.setUploadUser("lijinxin_default");
                fileService.insertFileDemo(fileDto);
                return "上传成功";
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
        } else {
            return ("上传失败，因为文件为空.");
        }
    }

}
