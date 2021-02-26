package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2021-02-22 10:37:44
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 311297791403863670L;

    private Integer eid;

    private String empid;

    private String empname;

    private String gender;

    private String idcard;

    private String phone;

    private String birthday;

    private String address;

    private String headimg;

    private String siteid;

    private Integer ystatus;

    private Integer pickUpWorkOrderCount;

    public Integer getPickUpWorkOrderCount() {
        return pickUpWorkOrderCount;
    }

    public void setPickUpWorkOrderCount(Integer pickUpWorkOrderCount) {
        this.pickUpWorkOrderCount = pickUpWorkOrderCount;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public Integer getYstatus() {
        return ystatus;
    }

    public void setYstatus(Integer ystatus) {
        this.ystatus = ystatus;
    }

}