package cn.clean.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Dynamic {
    private Integer id;

    private Integer userid;

    private LocalDateTime createtime;

    private String content;

    private String mediumaddress;

    private Integer type;

    private Integer likeNum;

    private Long isdel;

    private Long isabled;

    private Integer commentNum;

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

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMediumaddress() {
        return mediumaddress;
    }

    public void setMediumaddress(String mediumaddress) {
        this.mediumaddress = mediumaddress == null ? null : mediumaddress.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Long getIsdel() {
        return isdel;
    }

    public void setIsdel(Long isdel) {
        this.isdel = isdel;
    }

    public Long getIsabled() {
        return isabled;
    }

    public void setIsabled(Long isabled) {
        this.isabled = isabled;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", mediumaddress='" + mediumaddress + '\'' +
                ", type=" + type +
                ", likeNum=" + likeNum +
                ", isdel=" + isdel +
                ", isabled=" + isabled +
                ", commentNum=" + commentNum +
                '}';
    }
}
