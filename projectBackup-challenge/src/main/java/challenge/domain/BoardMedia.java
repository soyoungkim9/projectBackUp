package challenge.domain;

import java.io.Serializable;

// 게시물미디어
public class BoardMedia extends CommunityBoard implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int cmedno; // 게시물사진번호
    private String cpath; // 사진
    
    public int getCmedno() {
        return cmedno;
    }
    public void setCmedno(int cmedno) {
        this.cmedno = cmedno;
    }
    public String getCpath() {
        return cpath;
    }
    public void setCpath(String cpath) {
        this.cpath = cpath;
    }
}
