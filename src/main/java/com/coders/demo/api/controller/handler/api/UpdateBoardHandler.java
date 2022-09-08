package com.coders.demo.api.controller.handler.api;

import com.coders.demo.api.controller.Constants;
import com.coders.demo.api.controller.handler.BaseHandler;
import com.coders.demo.api.controller.request.api.*;
import com.coders.demo.api.controller.response.api.*;
import com.coders.demo.api.mapper.vo.*;
import com.coders.demo.api.service.CustomUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.coders.demo.api.mapper.DemoMapper;
import com.coders.demo.api.controller.vo.*;
import com.coders.demo.api.controller.ResultCode;
import java.util.List;
import java.util.ArrayList;

@Slf4j
@Component
public class UpdateBoardHandler extends BaseHandler {

  @Autowired
  private DemoMapper mapper;

  public UpdateBoardResponse execute(CustomUserDetails user, UpdateBoardRequest req) {
    UpdateBoardResponse res = new UpdateBoardResponse();

    final int boardId = req.getBoardId();
    final String title = req.getTitle();
    final String content = req.getContent();

    if (emptyParam(title) || emptyParam(content)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      mapper.updateBoard(boardId, title,content);
      res.setCode(ResultCode.Success);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
