package cn.clean.entity.user;


import java.time.LocalDateTime;

public class DynamicUser {

    private Integer id;

    private Integer userid;

    private LocalDateTime createtime;

    private String content;

    private String mediumaddress;

    private Integer type;

    private Integer likeNum;

    private Integer commentNum;

    private User user;

    private String roleName;

    private Integer likeStatic=0;

    private Integer isabled;

    public Integer getIsabled() {
        return isabled;
    }

    public void setIsabled(Integer isabled) {
        this.isabled = isabled;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getLikeStatic() {
        return likeStatic;
    }

    public void setLikeStatic(Integer likeStatic) {
            this.likeStatic = likeStatic;
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
        this.content = content;
    }

    public String getMediumaddress() {
        return mediumaddress;
    }

    public void setMediumaddress(String mediumaddress) {
        this.mediumaddress = mediumaddress;
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

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DynamicUser{" +
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", mediumaddress='" + mediumaddress + '\'' +
                ", type=" + type +
                ", likeNum=" + likeNum +
                ", commentNum=" + commentNum +
                ", user=" + user +
                ", likeStatic=" + likeStatic +
                '}';
    }
}
