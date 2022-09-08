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
public class BoardVo {

  public int boardId;

  public String title;

  public String content;
}
