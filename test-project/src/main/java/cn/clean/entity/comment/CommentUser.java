package cn.clean.entity.comment;

import cn.clean.entity.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommentUser {
    private Integer id;

    private Integer userid;

    private Integer dynamicId;

    private Integer parentCommentId;

    private String content;

    private LocalDateTime createtime;

    private User user;

    private List<CommentUser> commentList = new ArrayList<>();


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

    public Integer getDynamicId() {
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
        this.content = content;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public List<CommentUser> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentUser> commentList) {
        this.commentList = commentList;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getIsabled() {
        return isabled;
    }

    public void setIsabled(Integer isabled) {
        this.isabled = isabled;
    }

    @Override
    public String toString() {
        return "CommentUser{" +
                "id=" + id +
                ", userid=" + userid +
                ", dynamicId=" + dynamicId +
                ", parentCommentId=" + parentCommentId +
                ", content='" + content + '\'' +
                ", creatime=" + createtime +
                ", user=" + user +
                ", isdel=" + isdel +
                ", isabled=" + isabled +
                '}';
    }
}
