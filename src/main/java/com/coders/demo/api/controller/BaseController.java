package com.coders.demo.api.controller;

import com.coders.demo.api.service.CustomUserDetails;
import org.springframework.web.bind.annotation.RequestMethod;

public class BaseController {

  protected boolean checkRoute(RequestMethod method, String path, CustomUserDetails user) {
    return true;
  }
}
