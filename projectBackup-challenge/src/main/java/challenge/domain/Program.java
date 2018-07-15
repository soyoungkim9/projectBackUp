package challenge.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/* 프로그램 */
public class Program implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int pno; // 프로그램 번호
    private String postNum; // 우편번호
    private String baseAddr; // 기본주소
    private String detailAddr; // 상세주소
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate; // 시작일
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate; // 종료일
    private String pName; // 프로그램명
    private int minQty; // 최소인원
    private int maxQty; // 최대인원
    private int price; // 가격
    private String description; // 프로그램 설명
    private String pType; // 프로그램 종목
    private String goal; // 프로그램 목표
    private double goalNum; // 프로그램 목표 수치
    private int th; // 프로그램 기수
    private int times; // 프로그램 회차
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date pDay; // 프로그램수업요일
    @JsonFormat(pattern="HH:mm")
    private Date pTime; // 프로그램수업시간
    private int pState; // 프로그램진행상태
    private String pResult; // 프로그램 진행상태 내용
    
    public int getPno() {
        return pno;
    }
    public void setPno(int pno) {
        this.pno = pno;
    }
    public String getPostNum() {
        return postNum;
    }
    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }
    public String getBaseAddr() {
        return baseAddr;
    }
    public void setBaseAddr(String baseAddr) {
        this.baseAddr = baseAddr;
    }
    public String getDetailAddr() {
        return detailAddr;
    }
    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getMinQty() {
        return minQty;
    }
    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    public int getMaxQty() {
        return maxQty;
    }
    public void setMaxQty(int maxQty) {
        this.maxQty = maxQty;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getpType() {
        return pType;
    }
    public void setpType(String pType) {
        this.pType = pType;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public double getGoalNum() {
        return goalNum;
    }
    public void setGoalNum(double goalNum) {
        this.goalNum = goalNum;
    }
    public int getTh() {
        return th;
    }
    public void setTh(int th) {
        this.th = th;
    }
    public int getTimes() {
        return times;
    }
    public void setTimes(int times) {
        this.times = times;
    }
    public Date getpDay() {
        return pDay;
    }
    public void setpDay(Date pDay) {
        this.pDay = pDay;
    }
    public Date getpTime() {
        return pTime;
    }
    public void setpTime(Date pTime) {
        this.pTime = pTime;
    }
    public int getpState() {
        return pState;
    }
    public void setpState(int pState) {
        this.pState = pState;
    }
    public String getpResult() {
        return pResult;
    }
    public void setpResult(String pResult) {
        this.pResult = pResult;
    }
}
