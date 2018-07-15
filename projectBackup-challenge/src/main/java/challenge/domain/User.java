package challenge.domain;

import java.io.Serializable;

/* 사용자 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int uno; // 사용자 번호
    private String uName; // 사용자 이름
    private char sex; // 성별
    private String email; // 이메일
    private String password; // 비밀번호
    private String uPath; // 사용자 사진
    private String phone; // 핸드폰번호
    private int uType; // 사용자 유형
    
    public int getUno() {
        return uno;
    }
    public void setUno(int uno) {
        this.uno = uno;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getuPath() {
        return uPath;
    }
    public void setuPath(String uPath) {
        this.uPath = uPath;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getuType() {
        return uType;
    }
    public void setuType(int uType) {
        this.uType = uType;
    }
}
