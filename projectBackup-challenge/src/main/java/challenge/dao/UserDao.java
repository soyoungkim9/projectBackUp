package challenge.dao;

import java.util.List;
import java.util.Map;

import challenge.domain.User;

// 고치기
public interface UserDao {
    int delete(String mail);
    List<User> selectList(Map<String,Object> params);
    int insert(User user);
    int update(User user);
    User selectOne(String mail);
    User selectOneWithPassword(Map<String,Object> params);
    int count(Map<String,Object> params);
}
