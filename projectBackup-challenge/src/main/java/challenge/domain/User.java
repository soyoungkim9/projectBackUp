package challenge.domain;

import java.io.Serializable;

// 사용자
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int uno; // 사용자번호
    private String uname; // 이름
    private char sex; // 성별
    private String mail; // 이메일
    private String pwd; // 비밀번호
    private String upath; // 사진
    private String uphon; // 핸드폰번호
    private int utype; // 유형
    
    public int getUno() {
        return uno;
    }
    public void setUno(int uno) {
        this.uno = uno;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getUpath() {
        return upath;
    }
    public void setUpath(String upath) {
        this.upath = upath;
    }
    public String getUphon() {
        return uphon;
    }
    public void setUphon(String uphon) {
        this.uphon = uphon;
    }
    public int getUtype() {
        return utype;
    }
    public void setUtype(int utype) {
        this.utype = utype;
    }
    
    
}
