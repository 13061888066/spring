package com.mage.crm.controller;

import com.mage.crm.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@Slf4j
public class IndexController extends BaseController {

    @ResponseBody
    @RequestMapping("index")
    public String index(String name, String password, Model model) {
        log.debug("name={}, password={}", name, password);
        model.addAttribute("name",name);
        model.addAttribute("password",password);
        return "index";
    }

    @RequestMapping("welcome")
    public String index() {
       return  "index";
    }
}
