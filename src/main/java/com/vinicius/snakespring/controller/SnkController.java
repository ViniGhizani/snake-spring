package com.vinicius.snakespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SnkController {

  @GetMapping("/")
  public String index() {
    return "index";
  }
}
