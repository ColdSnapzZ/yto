package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (OrderSender)实体类
 *
 * @author makejava
 * @since 2021-01-07 13:52:00
 */
public class OrderSender implements Serializable {
    private static final long serialVersionUID = 246499232780291431L;
    
    private Integer osid;
    
    private String onumber;
    
    private String sname;
    
    private String sphone;
    
    private String sdistrict;
    
    private String sdetailed;


    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSdistrict() {
        return sdistrict;
    }

    public void setSdistrict(String sdistrict) {
        this.sdistrict = sdistrict;
    }

    public String getSdetailed() {
        return sdetailed;
    }

    public void setSdetailed(String sdetailed) {
        this.sdetailed = sdetailed;
    }

}