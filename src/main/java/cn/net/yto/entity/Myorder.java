package cn.net.yto.entity;

import java.io.Serializable;

/**
 * (Myorder)实体类
 *
 * @author makejava
 * @since 2021-01-05 15:10:42
 */
public class Myorder implements Serializable {
    private static final long serialVersionUID = 663957729346455075L;

    private Integer oid;

    private String uid;

    private String onumber;

    private String wnumber;

    private String itemtype;

    private String remark;

    private Double weight;

    private String otime;

    private Integer ystatus;

    private Double money;
    private Userinfo userinfo;

    private OrderSender orderSender;

    private OrderConsignee orderConsignee;

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public OrderSender getOrderSender() {
        return orderSender;
    }

    public void setOrderSender(OrderSender orderSender) {
        this.orderSender = orderSender;
    }

    public OrderConsignee getOrderConsignee() {
        return orderConsignee;
    }

    public void setOrderConsignee(OrderConsignee orderConsignee) {
        this.orderConsignee = orderConsignee;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public String getWnumber() {
        return wnumber;
    }

    public void setWnumber(String wnumber) {
        this.wnumber = wnumber;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public Integer getYstatus() {
        return ystatus;
    }

    public void setYstatus(Integer ystatus) {
        this.ystatus = ystatus;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Myorder{" +
                "oid=" + oid +
                ", uid='" + uid + '\'' +
                ", onumber='" + onumber + '\'' +
                ", wnumber='" + wnumber + '\'' +
                ", itemtype='" + itemtype + '\'' +
                ", remark='" + remark + '\'' +
                ", weight=" + weight +
                ", otime='" + otime + '\'' +
                ", ystatus=" + ystatus +
                ", money=" + money +
                '}';
    }
}