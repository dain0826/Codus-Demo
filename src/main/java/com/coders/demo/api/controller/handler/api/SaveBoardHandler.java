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
public class SaveBoardHandler extends BaseHandler {

  @Autowired
  private DemoMapper mapper;

  public SaveBoardResponse execute(CustomUserDetails user, SaveBoardRequest req) {
    SaveBoardResponse res = new SaveBoardResponse();

    final String title = req.getTitle();
    final String content = req.getContent();

    if (emptyParam(title) || emptyParam(content)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      mapper.saveBoard(title,content);
      res.setTitle(title);
      res.setContent(content);
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
