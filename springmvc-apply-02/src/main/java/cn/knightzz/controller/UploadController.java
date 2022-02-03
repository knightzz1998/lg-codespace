package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: UploadController
 * @projectName springmvc-apply-02
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 21:06
 */
@Controller
public class UploadController {

    /**
     * 上传单文件
     * @param username
     * @param filePic 需要和上传文件前端的 name 一致
     * @return
     * @throws IOException
     */
    @RequestMapping("/fileUpload")
    public String upload(String username, MultipartFile filePic) throws IOException {
        System.out.println("username = " + username);
        String originalFilename = filePic.getOriginalFilename();
        System.out.println(originalFilename);
        // 保存文件
        filePic.transferTo(new File("k://" + originalFilename));
        return "success";
    }

    @RequestMapping("/fileUpload2")
    public String upload2(String username, MultipartFile[] filePic) throws IOException {
        System.out.println("username = " + username);

        for (MultipartFile multipartFile : filePic) {
            String originalFilename = multipartFile.getOriginalFilename();
            System.out.println(originalFilename);
            // 保存文件
            multipartFile.transferTo(new File("k://" + originalFilename));
        }
        return "success";
    }
}
