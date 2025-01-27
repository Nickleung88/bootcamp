package bc2409psb.demo_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {
  @GetMapping(value = "/helloworld2")
  public String helloworld() {
    return "Hell111o World !223!!!";
  }

}
