package com.coders.demo.api.controller.request.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "board list")
@Data
public class BoardListRequest {

  public boolean invalid() {
    return false;
  }
}
