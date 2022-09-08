package com.coders.demo.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.coders.demo.api.mapper.vo.*;
import java.util.List;
@Mapper
public interface DemoMapper {

  UserVo selectUserInfo(@Param("email") String email);

  void saveBoard(@Param("title") String title, @Param("content") String content);

  List<BoardVo> findAllBoard();

  void deleteBoard(@Param("boardId") int boardId);

  void updateBoard(@Param("boardId") int boardId, @Param("title") String title, @Param("content") String content);
}
