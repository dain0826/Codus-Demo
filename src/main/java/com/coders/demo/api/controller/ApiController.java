package com.coders.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.coders.demo.api.controller.handler.*;
import com.coders.demo.api.controller.request.api.*;
import com.coders.demo.api.controller.response.api.*;
import com.coders.demo.api.service.CustomUserDetails;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import com.coders.demo.api.controller.handler.api.*;
import com.coders.demo.api.controller.vo.*;

@RestController
@RequestMapping("/api/boards")
public class ApiController extends BaseController {
  static Logger logger = LoggerFactory.getLogger(ApiController.class);

  @Autowired
  private GetTestDataHandler getTestDataHandler;

  @RequestMapping(method = RequestMethod.GET, value = "getTestData")
  @ApiOperation(value = "test data")
  GetTestDataResponse getTestData(@AuthenticationPrincipal Authentication auth, @RequestParam(value = "email", required = true) String email, @RequestParam(value = "name", required = false) String name, HttpServletRequest request) {
    getTestDataHandler.setHttpServletRequest(request);
    CustomUserDetails user = null;
    if (auth != null) {
      user = (CustomUserDetails) auth.getPrincipal();
    }
    GetTestDataRequest req = new GetTestDataRequest();
    req.setEmail(email);
    req.setName(name);
    if (checkRoute(RequestMethod.GET, "/api/boards/getTestData", user) == false) {
      throw new RestClientResponseException("", HttpStatus.UNAUTHORIZED.value(), "", null, null, null);
    }
    return getTestDataHandler.execute(user, req);
  }

  @Autowired
  private SaveBoardHandler saveBoardHandler;

  @RequestMapping(method = RequestMethod.POST, value = "saveBoard")
  @ApiOperation(value = "save board")
  SaveBoardResponse saveBoard(@AuthenticationPrincipal Authentication auth, @RequestParam(value = "title", required = true) String title, @RequestParam(value = "content", required = true) String content, HttpServletRequest request) {
    saveBoardHandler.setHttpServletRequest(request);
    CustomUserDetails user = null;
    if (auth != null) {
      user = (CustomUserDetails) auth.getPrincipal();
    }
    SaveBoardRequest req = new SaveBoardRequest();
    req.setTitle(title);
    req.setContent(content);
    if (checkRoute(RequestMethod.POST, "/api/boards/saveBoard", user) == false) {
      throw new RestClientResponseException("", HttpStatus.UNAUTHORIZED.value(), "", null, null, null);
    }
    return saveBoardHandler.execute(user, req);
  }

  @Autowired
  private BoardListHandler boardListHandler;

  @RequestMapping(method = RequestMethod.GET, value = "boardList")
  @ApiOperation(value = "board list")
  BoardListResponse boardList(@AuthenticationPrincipal Authentication auth, HttpServletRequest request) {
    boardListHandler.setHttpServletRequest(request);
    CustomUserDetails user = null;
    if (auth != null) {
      user = (CustomUserDetails) auth.getPrincipal();
    }
    BoardListRequest req = new BoardListRequest();
    if (checkRoute(RequestMethod.GET, "/api/boards/boardList", user) == false) {
      throw new RestClientResponseException("", HttpStatus.UNAUTHORIZED.value(), "", null, null, null);
    }
    return boardListHandler.execute(user, req);
  }

  @Autowired
  private DeleteBoardHandler deleteBoardHandler;

  @RequestMapping(method = RequestMethod.POST, value = "deleteBoard")
  @ApiOperation(value = "delete board")
  DeleteBoardResponse deleteBoard(@AuthenticationPrincipal Authentication auth, @RequestParam(value = "boardId", required = true) int boardId, HttpServletRequest request) {
    deleteBoardHandler.setHttpServletRequest(request);
    CustomUserDetails user = null;
    if (auth != null) {
      user = (CustomUserDetails) auth.getPrincipal();
    }
    DeleteBoardRequest req = new DeleteBoardRequest();
    req.setBoardId(boardId);
    if (checkRoute(RequestMethod.POST, "/api/boards/deleteBoard", user) == false) {
      throw new RestClientResponseException("", HttpStatus.UNAUTHORIZED.value(), "", null, null, null);
    }
    return deleteBoardHandler.execute(user, req);
  }


  @Autowired
  private UpdateBoardHandler updateBoardHandler;

  @RequestMapping(method = RequestMethod.POST, value = "updateBoard")
  @ApiOperation(value = "update board")
  UpdateBoardResponse updateBoard(@AuthenticationPrincipal Authentication auth, @RequestParam(value = "boardId", required = true) int boardId,@RequestParam(value = "title", required = true) String title, @RequestParam(value = "content", required = true) String content, HttpServletRequest request) {
    updateBoardHandler.setHttpServletRequest(request);
    CustomUserDetails user = null;
    if (auth != null) {
      user = (CustomUserDetails) auth.getPrincipal();
    }
    UpdateBoardRequest req = new UpdateBoardRequest();
    req.setBoardId(boardId);
    req.setTitle(title);
    req.setContent(content);
    if (checkRoute(RequestMethod.POST, "/api/boards/updateBoard", user) == false) {
      throw new RestClientResponseException("", HttpStatus.UNAUTHORIZED.value(), "", null, null, null);
    }
    return updateBoardHandler.execute(user, req);
  }
}
