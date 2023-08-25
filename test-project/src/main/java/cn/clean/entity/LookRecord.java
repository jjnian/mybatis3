package cn.clean.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class LookRecord {
    private Integer id;

    private Integer userId;

    private Integer viewUserId;

    private LocalDateTime createTime;

    private Integer type;

    private Integer isAbled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getViewUserId() {
        return viewUserId;
    }

    public void setViewUserId(Integer viewUserId) {
        this.viewUserId = viewUserId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsAbled() {
        return isAbled;
    }

    public void setIsAbled(Integer isAbled) {
        this.isAbled = isAbled;
    }
}
