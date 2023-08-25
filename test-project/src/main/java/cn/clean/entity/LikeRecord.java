package cn.clean.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LikeRecord {
    private Integer id;

    private Integer userid;

    private Integer dynamicid;

    private Integer status;

    private LocalDateTime createtime;

    private String type;

    private Integer sendmessage;

    public Integer getSendmessage() {
        return sendmessage;
    }

    public void setSendmessage(Integer sendmessage) {
        this.sendmessage = sendmessage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDynamicid() {
        return dynamicid;
    }

    public void setDynamicid(Integer dynamicid) {
        this.dynamicid = dynamicid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
