package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GoodbyeController {
  @GetMapping(value = "/goodbye")
  public Integer goodbye() {
    return 100;
  }
}
