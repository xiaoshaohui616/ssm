package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Student implements Serializable {
    @Id
    @Column(name = "sId")
    private Integer sid;

    @Column(name = "stuName")
    private String stuname;

    @Column(name = "stuAge")
    private Integer stuage;

    @Column(name = "stuSex")
    private String stusex;

    @Column(name = "birthDate")
    private Date birthdate;

    private static final long serialVersionUID = 1L;

    /**
     * @return sId
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return stuName
     */
    public String getStuname() {
        return stuname;
    }

    /**
     * @param stuname
     */
    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    /**
     * @return stuAge
     */
    public Integer getStuage() {
        return stuage;
    }

    /**
     * @param stuage
     */
    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    /**
     * @return stuSex
     */
    public String getStusex() {
        return stusex;
    }

    /**
     * @param stusex
     */
    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    /**
     * @return birthDate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", stuname=").append(stuname);
        sb.append(", stuage=").append(stuage);
        sb.append(", stusex=").append(stusex);
        sb.append(", birthdate=").append(birthdate);
        sb.append("]");
        return sb.toString();
    }
}