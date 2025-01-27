package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.model.Dog;

@Controller
@ResponseBody
@RequestMapping(value = "/v1")
public class AnimalController {
  // Read
  @GetMapping(value = "/dog/{age}/{name}")
  public Dog getDog(@PathVariable String age, @PathVariable String name) {
    int dogAge = -1;
    try {
      dogAge = Integer.parseInt(age);
    } catch (NumberFormatException e) {
      return new Dog(null, -1);
    }
    return new Dog(name, dogAge);
  }
}
