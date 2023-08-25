package cn.clean.entity.comment;

import java.time.LocalDateTime;
import java.util.Date;

public class Comment {
    private Integer id;

    private Integer userid;

    private Integer dynamicId;

    private Integer parentCommentId;

    private String content;

    private LocalDateTime createtime;

    private Integer isdel;

    private Integer isabled;

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

    public Integer getDynamId() {
        return dynamicId;
    }

    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public LocalDateTime getCreatime() {
        return createtime;
    }

    public void setCreatime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getIsbaled() {
        return isabled;
    }

    public void setIsbaled(Integer isbaled) {
        this.isabled = isbaled;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userid=" + userid +
                ", dynamicid=" + dynamicId +
                ", parentcommentid=" + parentCommentId +
                ", content='" + content + '\'' +
                ", creatime=" + createtime +
                ", isdel=" + isdel +
                ", isabled=" + isabled +
                '}';
    }
}
