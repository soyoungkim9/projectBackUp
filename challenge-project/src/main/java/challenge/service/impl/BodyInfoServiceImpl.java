// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package challenge.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import challenge.dao.BodyInfoDao;
import challenge.domain.BodyInfo;
import challenge.service.BodyInfoService;


@Service
public class BodyInfoServiceImpl implements BodyInfoService {

    BodyInfoDao bodyInfoDao;
 
    
    public BodyInfoServiceImpl(BodyInfoDao bodyInfoDao) {
        this.bodyInfoDao = bodyInfoDao;
       
    }
    
    @Override
    public List<BodyInfo> list() {
//        HashMap<String,Object> params = new HashMap<>();
//        params.put("startRowNo", (pageNo - 1) * pageSize);
//        params.put("pageSize", pageSize);
        
        return bodyInfoDao.selectList();
    }
    
    @Override
    public int delete(int no) {
        return bodyInfoDao.delete(no);
    }

    @Override
    public List<BodyInfo> get(int no) {
        return bodyInfoDao.selectOne(no);
    }
    
    @Override
    public int add(BodyInfo bodyInfo) {
       
        return bodyInfoDao.insert(bodyInfo);
    }
    
    @Override
    public int update(BodyInfo bodyInfo) {
        return bodyInfoDao.update(bodyInfo);
    }
    
    @Override
    public List<BodyInfo> listWithGoal(int uno) {
        return bodyInfoDao.selectListWithGoal(uno);
    }
    
    
    

}