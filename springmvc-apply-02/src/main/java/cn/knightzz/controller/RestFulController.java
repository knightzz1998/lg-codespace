package cn.knightzz.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 王天赐
 * @title: RestFulController
 * @projectName springmvc-apply-02
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 20:32
 */
@RestController
public class RestFulController {

    @GetMapping(value = "/user/{id}")
    public String get(@PathVariable Integer id){
        return "get : " + id;
    }

    @PostMapping(value = "/user")
    public String post(){
        return "post";
    }

    @PutMapping(value = "/user")
    public String put() { return "put"; }

    @DeleteMapping(value = "/user/{id}")
    public String delete(@PathVariable Integer id) { return "delete："+ id; }
}
