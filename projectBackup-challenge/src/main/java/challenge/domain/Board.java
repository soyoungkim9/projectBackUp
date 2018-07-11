package challenge.domain;

import java.io.Serializable;
import java.sql.Date;

// 게시글
public class Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int pono; // 게시글번호
    private String pocount; // 내용
    private Date podate; // 일시
    
    public int getPono() {
        return pono;
    }
    public void setPono(int pono) {
        this.pono = pono;
    }
    public String getPocount() {
        return pocount;
    }
    public void setPocount(String pocount) {
        this.pocount = pocount;
    }
    public Date getPodate() {
        return podate;
    }
    public void setPodate(Date podate) {
        this.podate = podate;
    }
}
