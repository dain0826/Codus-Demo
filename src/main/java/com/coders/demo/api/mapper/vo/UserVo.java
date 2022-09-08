package com.coders.demo.api.mapper.vo;

import lombok.Data;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.sql.Date;
import java.sql.Time;

@Data
@ToString
public class UserVo {

  public String email;

  public String nickname;

  public int userType;

  public String encryptedPassword;

  public String salt;
}
