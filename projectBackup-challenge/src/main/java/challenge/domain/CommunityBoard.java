package challenge.domain;

import java.io.Serializable;

// 커뮤니티-게시물
public class CommunityBoard extends Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int cmuno; // 커뮤니티 글번호
    private String cmut; // 제목
    private int cmu_cnt; // 조회수
    private String cmu_type; // 말머리
    private int cmu_lk; // 수량
    
    public int getCmuno() {
        return cmuno;
    }
    public void setCmuno(int cmuno) {
        this.cmuno = cmuno;
    }
    public String getCmut() {
        return cmut;
    }
    public void setCmut(String cmut) {
        this.cmut = cmut;
    }
    public int getCmu_cnt() {
        return cmu_cnt;
    }
    public void setCmu_cnt(int cmu_cnt) {
        this.cmu_cnt = cmu_cnt;
    }
    public String getCmu_type() {
        return cmu_type;
    }
    public void setCmu_type(String cmu_type) {
        this.cmu_type = cmu_type;
    }
    public int getCmu_lk() {
        return cmu_lk;
    }
    public void setCmu_lk(int cmu_lk) {
        this.cmu_lk = cmu_lk;
    }
}
