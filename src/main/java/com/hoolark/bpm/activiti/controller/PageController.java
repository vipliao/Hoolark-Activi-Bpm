package com.hoolark.bpm.activiti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class PageController {
    @GetMapping("editor")
    public String test(){
        return "/modeler";
    }
}
