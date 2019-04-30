package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName QuickStartController
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2018/12/3 9:17
 * @Version V1.0
 */
@RestController
public class QuickStartController {

    @RequestMapping(value = "/quick2")
    public String quick(){
        System.out.println("欢迎访问QuickStartController类中的quick()方法2");
        return "Spring Boot的入门程序！大家都能学好它,妥妥的2";
    }
}
