package com.coders.demo.api.controller.request.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "test data")
@Data
public class GetTestDataRequest {

  @ApiParam(value = "email", required = true)
  public String email; // email

  @ApiParam(value = "name", required = false)
  public String name; // name

  public boolean invalid() {
    if (
      email == null || email.length() == 0
    ) {
      return true;
    }
    return false;
  }
}
