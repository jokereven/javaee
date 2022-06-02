package github.com.jokereven.entity;

import java.util.Date;

public class Applicant {

    private Integer acId;//编号
    private String acName;//申报人姓名
    private Date acBirthday;//生日
    private Integer acSex;//性别
    private Integer workinglife;//工作年限

    //无参构造
    public Applicant() {
    }

    //有参构造
    public Applicant(Integer acId, String acName, Date acBirthday, Integer acSex, Integer  workinglife) {
        this.acId = acId;
        this.acName = acName;
        this.acBirthday = acBirthday;
        this.acSex = acSex;
        this.workinglife = workinglife;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }
    public String getAcName() {
        return acName;
    }
    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }
    public Date getAcBirthday() {
        return acBirthday;
    }

    public void setAcBirthday(Date acBirthday) {
        this.acBirthday = acBirthday;
    }

    public Integer getAcSex() {
        return acSex;
    }

    public void setAcSex(Integer acSex) {
        this.acSex = acSex;
    }

    public Integer getWorkinglife() {
        return workinglife;
    }

    public void setWorkinglife(Integer workinglife) {
        this.workinglife = workinglife;
    }
}