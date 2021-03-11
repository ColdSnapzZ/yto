package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Stowage)实体类
 *
 * @author makejava
 * @since 2021-02-18 16:53:07
 */
public class Stowage implements Serializable {
    private static final long serialVersionUID = -72215867255696187L;

    private Integer stid;

    private String opnumber;

    private String cardid;

    private String lineid;

    private String putime;

    private String ontime;

    private Integer ystatus;


    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getOpnumber() {
        return opnumber;
    }

    public void setOpnumber(String opnumber) {
        this.opnumber = opnumber;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid;
    }

    public String getPutime() {
        return putime;
    }

    public void setPutime(String putime) {
        this.putime = putime;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    public Integer getYstatus() {
        return ystatus;
    }

    public void setYstatus(Integer ystatus) {
        this.ystatus = ystatus;
    }

}