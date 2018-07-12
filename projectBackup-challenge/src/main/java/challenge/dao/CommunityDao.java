package challenge.dao;

import java.util.List;

import challenge.domain.Community;

// 게시글
public interface CommunityDao {
    int delete(int no);
    List<Community> selectList();
    List<Community> selectListNotice();
    int insert(Community communityBoard);
    int update(Community communityBoard);
    Community selectOne(int no);
}
