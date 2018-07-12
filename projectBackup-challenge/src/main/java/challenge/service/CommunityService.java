package challenge.service;

import java.util.List;

import challenge.domain.Community;


// 커뮤니티 - 게시물
public interface CommunityService {
    // 서비스 컴포넌트에서 메서드명을 지을 때는 
    // 업무 용어를 사용하라!
    List<Community> list();
    List<Community> noticeList();
    Community get(int no);
    int add(Community community);
    int update(Community community);
    int delete(int no);
}
