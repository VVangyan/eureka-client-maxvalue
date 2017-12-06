package com.atlz.eurekaclientmaxvalue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @date: 2017-12-04
 * @author: yan
 */
@Controller
public class InfoController {
    @RequestMapping("/info")
    public String info(){
        return "index";
    }
}
