package com.bootcamp.web.demo_springweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Normal Response, code=0, message="SUCCESS.", body={"name"....}
// Error Response, code=99, message="XXXXXX.", body=null

@Getter
@Setter
@AllArgsConstructor
public class ApiResp<T> {
  private int code;
  private String message;
  private T body;
}
