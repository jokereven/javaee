package github.com.jokereven.entity;

import java.util.Date;

public class Applicant {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applicant.ac_id
     *
     * @mbg.generated
     */
    private Integer acId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applicant.ac_name
     *
     * @mbg.generated
     */
    private String acName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applicant.ac_birthday
     *
     * @mbg.generated
     */
    private Date acBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applicant.ac_sex
     *
     * @mbg.generated
     */
    private Integer acSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applicant.workingLife
     *
     * @mbg.generated
     */
    private Integer workinglife;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applicant.ac_id
     *
     * @return the value of applicant.ac_id
     *
     * @mbg.generated
     */
    public Integer getAcId() {
        return acId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applicant.ac_id
     *
     * @param acId the value for applicant.ac_id
     *
     * @mbg.generated
     */
    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applicant.ac_name
     *
     * @return the value of applicant.ac_name
     *
     * @mbg.generated
     */
    public String getAcName() {
        return acName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applicant.ac_name
     *
     * @param acName the value for applicant.ac_name
     *
     * @mbg.generated
     */
    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applicant.ac_birthday
     *
     * @return the value of applicant.ac_birthday
     *
     * @mbg.generated
     */
    public Date getAcBirthday() {
        return acBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applicant.ac_birthday
     *
     * @param acBirthday the value for applicant.ac_birthday
     *
     * @mbg.generated
     */
    public void setAcBirthday(Date acBirthday) {
        this.acBirthday = acBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applicant.ac_sex
     *
     * @return the value of applicant.ac_sex
     *
     * @mbg.generated
     */
    public Integer getAcSex() {
        return acSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applicant.ac_sex
     *
     * @param acSex the value for applicant.ac_sex
     *
     * @mbg.generated
     */
    public void setAcSex(Integer acSex) {
        this.acSex = acSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applicant.workingLife
     *
     * @return the value of applicant.workingLife
     *
     * @mbg.generated
     */
    public Integer getWorkinglife() {
        return workinglife;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applicant.workingLife
     *
     * @param workinglife the value for applicant.workingLife
     *
     * @mbg.generated
     */
    public void setWorkinglife(Integer workinglife) {
        this.workinglife = workinglife;
    }
}