package cn.clean.entity.user;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private Integer id;

    private String email;

    private String nickname;

    private String roleName;

    private String avatar;

    private String status;

    private Integer sptime;

    private String password;

    private Integer isable;

    private Integer points;

    private LocalDateTime createtime;

    private Integer age;

    private Double height;

    private Double weight;

    private String sex;

    private String attr;

    private String regions;

    private Integer signIn;

    private Integer nextLevelPoint;


    public Integer getNextLevelPoint() {
        return nextLevelPoint;
    }

    public void setNextLevelPoint(Integer nextLevelPoint) {
        this.nextLevelPoint = nextLevelPoint;
    }

    public Integer getSignIn() {
        return signIn;
    }

    public void setSignIn(Integer signIn) {
        this.signIn = signIn;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSptime() {
        return sptime;
    }

    public void setSptime(Integer sptime) {
        this.sptime = sptime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsable() {
        return isable;
    }

    public void setIsable(Integer isable) {
        this.isable = isable;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr == null ? null : attr.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", role='" + roleName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", isable=" + isable +
                ", points=" + points +
                ", createtime=" + createtime +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", attr='" + attr + '\'' +
                '}';
    }
}
