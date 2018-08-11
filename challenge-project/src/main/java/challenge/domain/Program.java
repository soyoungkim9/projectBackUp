package challenge.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Program implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no; // 프로그램 번호
    private String postNo; // 우편번호
    private String address; // 기본주소
    private String addDetail; // 상세주소
    private String name; // 프로그램명
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date endDate;
    private int minQty;
    private int maxQty;
    private int price;
    private String description;
    private String proType; // 종목
    private String proGoal; // 목표
    private String proGoalNum; // 목표수치
    private int proTh; // 기수
    private int proTurn; // 회차
    private String proDay; // 수업요일
    private String proTime; // 수업시간
    private int proState; // 진행상태
    private String proResult; // 진행상태내용

    private int challengeNo; // 챌린지번호
    private int trainerNo; // 트레이너번호

    private List<ProgramMedia> medias; // 프로그램 미디어
    User user;
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddDetail() {
        return addDetail;
    }

    public void setAddDetail(String addDetail) {
        this.addDetail = addDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProGoal() {
        return proGoal;
    }

    public void setProGoal(String proGoal) {
        this.proGoal = proGoal;
    }

    public String getProGoalNum() {
        return proGoalNum;
    }

    public void setProGoalNum(String proGoalNum) {
        this.proGoalNum = proGoalNum;
    }

    public int getProTh() {
        return proTh;
    }

    public void setProTh(int proTh) {
        this.proTh = proTh;
    }

    public int getProTurn() {
        return proTurn;
    }

    public void setProTurn(int proTurn) {
        this.proTurn = proTurn;
    }

    public String getProDay() {
        return proDay;
    }

    public void setProDay(String proDay) {
        this.proDay = proDay;
    }

    public String getProTime() {
        return proTime;
    }

    public void setProTime(String proTime) {
        this.proTime = proTime;
    }

    public int getProState() {
        return proState;
    }

    public void setProState(int proState) {
        this.proState = proState;
    }

    public String getProResult() {
        return proResult;
    }

    public void setProResult(String proResult) {
        this.proResult = proResult;
    }

    public int getChallengeNo() {
        return challengeNo;
    }

    public void setChallengeNo(int challengeNo) {
        this.challengeNo = challengeNo;
    }

    public List<ProgramMedia> getMedias() {
        return medias;
    }

    public void setMedias(List<ProgramMedia> medias) {
        this.medias = medias;
    }

    public int getTrainerNo() {
        return trainerNo;
    }

    public void setTrainerNo(int trainerNo) {
        this.trainerNo = trainerNo;
    }
    
    
    
    
}