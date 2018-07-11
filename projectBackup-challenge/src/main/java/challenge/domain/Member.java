package challenge.domain;

import java.io.Serializable;

// 회원
public class Member extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int uno; // 회원번호

    public int getUno() {
        return uno;
    }
    public void setUno(int uno) {
        this.uno = uno;
    }
    
    
}
