package cn.clean.entity.user;


import cn.clean.entity.Permission;

public class MyDetailUser {
    private Integer id;

    private String email;

    private String nickname;

    private String avatar;

    private Integer points;

    private Integer age;

    private Integer nextLevelPoint;

    private String sex;

    private String roleName;

    private String attr;

    private String regions;

    private String status;

    private Integer sptime;

    private Double weight;

    private Double Height;

    private Integer followers;

    private Integer viewers;

    private Integer dynamics;

    private Integer notices;

    private Integer hasClockIn;

    private Integer agreeLocation;

    private Permission permission;

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Integer getNextLevelPoint() {
        return nextLevelPoint;
    }

    public void setNextLevelPoint(Integer nextLevelPoint) {
        this.nextLevelPoint = nextLevelPoint;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public Integer getAgreeLocation() {
        return agreeLocation;
    }

    public void setAgreeLocation(Integer agreeLocation) {
        this.agreeLocation = agreeLocation;
    }

    public Integer getHasClockIn() {
        return hasClockIn;
    }

    public void setHasClockIn(Integer hasClockIn) {
        this.hasClockIn = hasClockIn;
    }

    public Integer getNotices() {
        return notices;
    }

    public void setNotices(Integer notices) {
        this.notices = notices;
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

    @Override
    public String toString() {
        return "MyDetailUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", points=" + points +
                ", age=" + age +
                ", nextLevelPoint=" + nextLevelPoint +
                ", sex='" + sex + '\'' +
                ", roleName='" + roleName + '\'' +
                ", attr='" + attr + '\'' +
                ", regions='" + regions + '\'' +
                ", status='" + status + '\'' +
                ", sptime=" + sptime +
                ", weight=" + weight +
                ", Height=" + Height +
                ", followers=" + followers +
                ", viewers=" + viewers +
                ", dynamics=" + dynamics +
                ", notices=" + notices +
                ", hasClockIn=" + hasClockIn +
                ", agreeLocation=" + agreeLocation +
                ", permission=" + permission +
                '}';
    }
}
