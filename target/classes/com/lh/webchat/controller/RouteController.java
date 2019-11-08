package com.lh.webchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :  LH
 * @date   :  2019-11-08
 * TODO   :  路由控制器
 */
@Controller
@RequestMapping(value = "")
public class RouteController {

    @RequestMapping(value = "")
    public String index() {
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/about")
    public String about() {
        return "about";
    }

    @RequestMapping(value = "/help")
    public String help() {
        return "help";
    }

    @RequestMapping(value = "/system")
    public String system() {
        return "system-setting";
    }

}
