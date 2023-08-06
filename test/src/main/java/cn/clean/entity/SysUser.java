package cn.clean.entity;

public class SysUser {
    private Integer id;

    private String nickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
