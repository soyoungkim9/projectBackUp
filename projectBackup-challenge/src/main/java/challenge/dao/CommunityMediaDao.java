package challenge.dao;

import java.util.List;
import java.util.Map;

public interface CommunityMediaDao {
    int insert(Map<String,Object> params); // String을 int로 바꿀꺼임
    int delete(Map<String,Object> params); // String을 int로 바꿀꺼임
    List<String> selectList(int cmedno);
    
}
