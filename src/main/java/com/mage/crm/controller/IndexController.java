package com.mage.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @RequestMapping("")
    public String index(String name, String password) {
        log.debug("name={}, password={}", name, password);
        return "index";
    }
}
