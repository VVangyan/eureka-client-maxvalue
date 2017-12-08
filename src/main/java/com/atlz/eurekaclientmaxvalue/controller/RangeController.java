package com.atlz.eurekaclientmaxvalue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:极差运算控制器(最大值，最小值)
 * @date: 2017-12-04
 * @author: yan
 */
@RestController
public class RangeController {
	@GetMapping("/max")
    public Integer max(@RequestParam Integer a, @RequestParam Integer b){
        if(a==null) return null;
        if(b==null) return null;
        return  a>b ? a:b;
    }
    @GetMapping("/min")
    public Integer min(@RequestParam Integer a, @RequestParam Integer b){
        if(a==null) return null;
        if(b==null) return null;
        return  a>b ? b:a;
    }
}
