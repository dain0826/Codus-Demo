package com.coders.demo.api.controller.request.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "save board")
@Data
public class SaveBoardRequest {

  @ApiParam(value = "title", required = true)
  public String title; // title

  @ApiParam(value = "content", required = true)
  public String content; // content

  public boolean invalid() {
    if (
      title == null || title.length() == 0 ||
      content == null || content.length() == 0
    ) {
      return true;
    }
    return false;
  }
}
