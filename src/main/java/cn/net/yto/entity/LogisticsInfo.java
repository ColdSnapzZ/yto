package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (LogisticsInfo)实体类
 *
 * @author makejava
 * @since 2021-03-04 15:08:49
 */
public class LogisticsInfo implements Serializable {
    private static final long serialVersionUID = -12265063980309302L;
    
    private Integer liid;
    
    private String wnumber;
    
    private String wtime;
    
    private String winfo;


    public Integer getLiid() {
        return liid;
    }

    public void setLiid(Integer liid) {
        this.liid = liid;
    }

    public String getWnumber() {
        return wnumber;
    }

    public void setWnumber(String wnumber) {
        this.wnumber = wnumber;
    }

    public String getWtime() {
        return wtime;
    }

    public void setWtime(String wtime) {
        this.wtime = wtime;
    }

    public String getWinfo() {
        return winfo;
    }

    public void setWinfo(String winfo) {
        this.winfo = winfo;
    }

}