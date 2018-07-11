package challenge.service;

import java.util.List;

import challenge.domain.Board;
import challenge.domain.BoardMedia;
import challenge.domain.CommunityBoard;


// 커뮤니티 - 게시물
public interface CommunityBoardService {
    List<CommunityBoard> list(int pageNo, int pageSize);
    CommunityBoard get(int no);
    int add(Board board, CommunityBoard communityBoard, BoardMedia boardMedia); // CommunityBoard는 Board를 상속받는다.
    int update(Board board, CommunityBoard communityBoard, BoardMedia boardMedia); // CommunityBoard는 Board를 상속받는다.
    int delete(int no);
}
