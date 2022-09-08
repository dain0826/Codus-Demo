package com.coders.demo.api.controller.response.api;

import com.coders.demo.api.controller.response.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import com.coders.demo.api.controller.vo.UserInfo;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "test data")
@Data
public class GetTestDataResponse extends BaseResponse {

  public UserInfo userInfo = null; //  user profile

  public String email = ""; // email
}
