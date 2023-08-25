package cn.clean.entity.user;

import java.time.LocalDateTime;

public class OtherDetailUser {
    private Integer id;

    private String status;

    private String email;

    private String nickname;

    private String avatar;


    private Integer points;


    private Integer age;

    private String sex;

    private String attr;

    private String roleName;

    private Integer nextLevelPoint;

    private String regions;

    private Integer followers;

    private Integer viewers;

    private Integer dynamics;

    private Integer hasFollower=0;

    private Double height;

    private Double weight;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getNextLevelPoint() {
        return nextLevelPoint;
    }

    public void setNextLevelPoint(Integer nextLevelPoint) {
        this.nextLevelPoint = nextLevelPoint;
    }

    public Integer getDynamics() {
        return dynamics;
    }

    public void setDynamics(Integer dynamics) {
        this.dynamics = dynamics;
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
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    public Integer getHasFollower() {
        return hasFollower;
    }

    public void setHasFollower(Integer hasFollower) {
        this.hasFollower = hasFollower;
    }
}
