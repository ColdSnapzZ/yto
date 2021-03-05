package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Expresspath)实体类
 *
 * @author makejava
 * @since 2021-03-05 11:04:28
 */
public class Expresspath implements Serializable {
    private static final long serialVersionUID = -73324583512211061L;

    private Integer epid;

    private String wnumber;

    private String path;

    private Integer mark;


    public Integer getEpid() {
        return epid;
    }

    public void setEpid(Integer epid) {
        this.epid = epid;
    }

    public String getWnumber() {
        return wnumber;
    }

    public void setWnumber(String wnumber) {
        this.wnumber = wnumber;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

}