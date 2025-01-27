package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.web.demo_springweb.DemoSpringwebApplication;


@Controller
@ResponseBody
@RequestMapping(value = "/v1")
public class BeanController {
    @GetMapping(value = "/beans")
  public String[] getbeans() {
    return DemoSpringwebApplication.context.getBeanDefinitionNames();

  
}
}