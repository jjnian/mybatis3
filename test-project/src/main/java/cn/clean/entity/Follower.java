package cn.clean.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Follower {
    private Integer id;

    private Integer userid;

    private Integer followerid;

    private LocalDateTime createtime;

    private Integer status;

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

    public Integer getFollowerid() {
        return followerid;
    }

    public void setFollowerid(Integer followerid) {
        this.followerid = followerid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
