package com.coders.demo.api.controller.request.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "delete board")
@Data
public class DeleteBoardRequest {

  @ApiParam(value = "null", required = true)
  public int boardId;

  public boolean invalid() {
    if (
      boardId < 0
    ) {
      return true;
    }
    return false;
  }
}
