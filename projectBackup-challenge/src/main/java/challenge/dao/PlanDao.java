package challenge.dao;

import java.util.List;

import challenge.domain.Plan;

// 운동계획서
public interface PlanDao {
    List<Plan> selectList(int no); // 전체 리스트
    Object selectOne(int no); // 해당 회차 일지 선택해서 보기
    int insert(Plan plan); // 운동일지 등록
    int update(Plan plan); // 운동일지 수정
}



