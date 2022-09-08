package com.coders.demo.api.controller.request.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "update board")
@Data
public class UpdateBoardRequest {
  @ApiParam(value = "boardId", required = false)
  public int boardId;

  @ApiParam(value = "title", required = false)
  public String title; // title

  @ApiParam(value = "content", required = false)
  public String content; // content

  public boolean invalid() {
    return false;
  }
}
