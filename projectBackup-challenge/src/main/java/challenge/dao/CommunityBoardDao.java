package challenge.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Board;
import challenge.domain.CommunityBoard;

// 게시글
public interface CommunityBoardDao {
    int delete(int no);
    List<CommunityBoard> selectList(Map<String,Object> params);
    int insert(Board board, CommunityBoard communityBoard);
    int update(Board board, CommunityBoard communityBoard);
    CommunityBoard selectOne(int no);
}
