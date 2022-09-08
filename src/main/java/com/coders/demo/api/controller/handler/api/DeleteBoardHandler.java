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
public class DeleteBoardHandler extends BaseHandler {

  @Autowired
  private DemoMapper mapper;

  public DeleteBoardResponse execute(CustomUserDetails user, DeleteBoardRequest req) {
    DeleteBoardResponse res = new DeleteBoardResponse();

    final int boardId = req.getBoardId();

    if (emptyParam(boardId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      res.setCode(ResultCode.Success);
      mapper.deleteBoard(boardId);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
