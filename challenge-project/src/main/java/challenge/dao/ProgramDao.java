package challenge.dao;

import java.util.List;
import java.util.Map;

import challenge.domain.Program;

public interface ProgramDao {

    public int delete(int no);
    public List<Program> selectList();
    public List<Program> selectListCard();
    public List<Program> selectListChallenge(int cno);
    public List<Program> selectListWithPrice();
    public List<Program> selectListWithStartDate();
    public List<Program> selectTrainerProgram(int no);
    public int insert(Program program);
    public int update(Program program);
    public Program selectOne(int no);
    public List<Program> mainList();
    public Program selectOneWithMedia(int no);
    Program selectRecent();
    public List<Program> selectPrice(Map<String,Object> prams);
	public List<Program> selectListWithKeyword(String keyword);
    public List<Integer> countCardsWithProgramGoal(Map<String, Object> param);
    public List<Program> selectListWithProgramType(Map<String, Object> param);
}
