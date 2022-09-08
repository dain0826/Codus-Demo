package com.coders.demo.api.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "user info")
@Data
@ToString
public class UserInfo {

  public String email = ""; //  user email

  public String nickname = ""; //  user nickname

  public UserType userType; //  user type
}
