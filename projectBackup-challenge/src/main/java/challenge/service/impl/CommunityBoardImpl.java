package challenge.service.impl;

import java.util.List;

import bitcamp.java106.pms.dao.BoardDao;
import challenge.dao.CommunityBoardDao;
import challenge.domain.Board;
import challenge.domain.BoardMedia;
import challenge.domain.CommunityBoard;
import challenge.service.CommunityBoardService;

public class CommunityBoardImpl implements CommunityBoardService {
    
    BoardDao boardDao;
    CommunityBoardDao communityBoardDao;
    BoardMedia boardMedia;
    
    public CommunityBoardImpl(BoardDao boardDao, CommunityBoardDao communityBoardDao, BoardMedia boardMedia) {
        
    }
    
    
    @Override
    public List<CommunityBoard> list(int pageNo, int pageSize) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public CommunityBoard get(int no) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int add(Board board, CommunityBoard communityBoard, BoardMedia boardMedia) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int update(Board board, CommunityBoard communityBoard, BoardMedia boardMedia) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int delete(int no) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
