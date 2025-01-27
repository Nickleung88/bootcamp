package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/v1")
public class MathOperationController {
  // http://localhost:8090/v1/math/add/9/7
  @GetMapping(value = "/math/add/{x}/{y}")
  public int add(@PathVariable int x, @PathVariable int y) {
    return x + y;
  }

  // http://localhost:8090/v1/math/subtract/9/7
  @GetMapping(value = "/math/subtract/{a}/{b}")
  public int subtract(@PathVariable(value = "a") int x,
      @PathVariable(value = "b") int y) {
    return x - y;
  }

  // http://localhost:8090/v1/math/multiply?x=9&y=7
  @GetMapping(value = "/math/multiply")
  public int multiply(@RequestParam int x, @RequestParam int y) {
    return x * y;
  }

  // http://localhost:8090/v1/math/divide?a=9&b=3
  @GetMapping(value = "/math/divide")
  public int divide(@RequestParam(value = "a") int x,
      @RequestParam(value = "b") int y) {
    return x / y;
  }

}
