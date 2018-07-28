package challenge.domain;

import java.io.Serializable;
import java.util.List;

public class Trainer extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String introduce; // 소개
    private String career; // 경력사항
    private String time; // 상담시간
    private String account; // 계좌
    private List<Program> programs;
    private String bank; // 은행명
    private int coin; // 수익금
    
    
    
    public List<Program> getProgram() {
        return programs;
    }
    public void setProgram(List<Program> program) {
        this.programs = program;
    }
    public String getIntroduce() {
        return introduce;
    }
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    
    
}
