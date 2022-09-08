package com.coders.demo.api.mapper;

import com.coders.demo.api.mapper.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DemoMapperService {

  @Autowired
   DemoMapper mapper;

  public UserVo selectUserInfo(String email) {
    return mapper.selectUserInfo(email);
  }

  public void saveBoard(String title, String content) {
    mapper.saveBoard(title, content);
  }

  public List<BoardVo> findAllBoard() {
    return mapper.findAllBoard();
  }

  public void deleteBoard(int boardId) {
    mapper.deleteBoard(boardId);
  }

  public void updateBoard(int boardId, String title, String content) {
    mapper.updateBoard(boardId, title, content);
  }
}
