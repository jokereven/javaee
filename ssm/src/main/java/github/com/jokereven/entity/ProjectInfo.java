package github.com.jokereven.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProjectInfo {

    private Integer piId;// 编号
    private String piProjectname; // 项目名称
    @DateTimeFormat(pattern="YYYY-mm-dd")
    private Date piStartdate;// 起始时间
    @DateTimeFormat(pattern="YYYY-mm-dd")
    private Date piEnddate;//结束时间
    private Integer piStatus; // 项目状态 0.已申报  1.审核中 2.已审核
    private Integer acid; //申报人编号  项目和申报人是 ： 多对一的关系

    //需要在项目类中创建 申报人对象 ： 一个项目对应一个申报人
    private Applicant applicant;

    //无参构造
    public ProjectInfo() {
    }

    //有参构造
    public ProjectInfo(Integer piId, String piProjectname, Date piStartdate, Date piEnddate, Integer piStatus, Integer acid, Applicant applicant) {
        this.piId = piId;
        this.piProjectname = piProjectname;
        this.piStartdate = piStartdate;
        this.piEnddate = piEnddate;
        this.piStatus = piStatus;
        this.acid = acid;
        this.applicant = applicant;
    }


    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public String getPiProjectname() {
        return piProjectname;
    }

    public void setPiProjectname(String piProjectname) {
        this.piProjectname = piProjectname == null ? null : piProjectname.trim();
    }

    public Date getPiStartdate() {
        return piStartdate;
    }

    public void setPiStartdate(Date piStartdate) {
        this.piStartdate = piStartdate;
    }

    public Date getPiEnddate() {
        return piEnddate;
    }

    public void setPiEnddate(Date piEnddate) {
        this.piEnddate = piEnddate;
    }

    public Integer getPiStatus() {
        return piStatus;
    }
    public void setPiStatus(Integer piStatus) {
        this.piStatus = piStatus;
    }

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        this.acid = acid;
    }
}