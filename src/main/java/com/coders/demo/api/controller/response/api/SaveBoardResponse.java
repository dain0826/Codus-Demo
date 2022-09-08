package com.coders.demo.api.controller.response.api;

import com.coders.demo.api.controller.response.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "save board")
@Data
public class SaveBoardResponse extends BaseResponse {

  public String title = "";

  public String content = "";
}
