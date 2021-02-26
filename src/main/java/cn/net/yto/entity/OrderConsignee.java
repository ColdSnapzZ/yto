package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (OrderConsignee)实体类
 *
 * @author makejava
 * @since 2021-01-07 13:52:31
 */
public class OrderConsignee implements Serializable {
    private static final long serialVersionUID = 155268735324342140L;
    
    private Integer ocid;
    
    private String onumber;
    
    private String cname;
    
    private String cphone;
    
    private String cdistrict;
    
    private String cdetailed;


    public Integer getOcid() {
        return ocid;
    }

    public void setOcid(Integer ocid) {
        this.ocid = ocid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCdistrict() {
        return cdistrict;
    }

    public void setCdistrict(String cdistrict) {
        this.cdistrict = cdistrict;
    }

    public String getCdetailed() {
        return cdetailed;
    }

    public void setCdetailed(String cdetailed) {
        this.cdetailed = cdetailed;
    }

}