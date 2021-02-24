package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Pickupworkorder)实体类
 *
 * @author makejava
 * @since 2021-02-23 09:45:13
 */
public class Pickupworkorder implements Serializable {
    private static final long serialVersionUID = 345832095213341730L;

    private Integer puid;

    private String puwonumber;

    private String empid;

    private String wotime;

    private String onumber;

    private Integer ystatus;


    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public String getPuwonumber() {
        return puwonumber;
    }

    public void setPuwonumber(String puwonumber) {
        this.puwonumber = puwonumber;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getWotime() {
        return wotime;
    }

    public void setWotime(String wotime) {
        this.wotime = wotime;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public Integer getYstatus() {
        return ystatus;
    }

    public void setYstatus(Integer ystatus) {
        this.ystatus = ystatus;
    }

    @Override
    public String toString() {
        return "Pickupworkorder{" +
                "puid=" + puid +
                ", puwonumber='" + puwonumber + '\'' +
                ", empid='" + empid + '\'' +
                ", wotime='" + wotime + '\'' +
                ", onumber='" + onumber + '\'' +
                ", ystatus=" + ystatus +
                '}';
    }
}