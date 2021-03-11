package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Cars)实体类
 *
 * @author makejava
 * @since 2021-01-11 16:06:21
 */
public class Cars implements Serializable {
    private static final long serialVersionUID = -61998645083025853L;

    private Integer cid;

    private String cname;

    private String empid;

    private String cartype;

    private String dotid;

    private Integer ystatus;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getDotid() {
        return dotid;
    }

    public void setDotid(String dotid) {
        this.dotid = dotid;
    }

    public Integer getYstatus() {
        return ystatus;
    }

    public void setYstatus(Integer ystatus) {
        this.ystatus = ystatus;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", empid='" + empid + '\'' +
                ", cartype='" + cartype + '\'' +
                ", dotid='" + dotid + '\'' +
                ", ystatus=" + ystatus +
                '}';
    }
}