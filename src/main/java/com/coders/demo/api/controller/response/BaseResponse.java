package com.coders.demo.api.controller.response;

import com.coders.demo.api.controller.ResultCode;
import lombok.Data;

@Data
public class BaseResponse {
  protected int code = -1;
  protected String message;

  public void setCode(int code) {
    this.code = code;
    this.message = ResultCode.get(code);
  }
}
