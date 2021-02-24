package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Site)实体类
 *
 * @author makejava
 * @since 2021-02-22 10:09:51
 */
public class Site implements Serializable {
    private static final long serialVersionUID = 107454873846500330L;

    private Integer sid;

    private String siteid;

    private String yarea;

    private String detailed;

    private String phone;

    private String empid;

    private String creationtime;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getYarea() {
        return yarea;
    }

    public void setYarea(String yarea) {
        this.yarea = yarea;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

}