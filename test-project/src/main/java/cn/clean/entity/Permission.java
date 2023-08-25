package cn.clean.entity;

public class Permission {


    private Integer isAgreeLocation;

    private Integer isAgreeInfo;

    private Integer isAgreeDynamic;

    private Integer isAgreeHome;

    public Integer getIsAgreeLocation() {
        return isAgreeLocation;
    }

    public void setIsAgreeLocation(Integer isAgreeLocation) {
        this.isAgreeLocation = isAgreeLocation;
    }

    public Integer getIsAgreeInfo() {
        return isAgreeInfo;
    }

    public void setIsAgreeInfo(Integer isAgreeInfo) {
        this.isAgreeInfo = isAgreeInfo;
    }

    public Integer getIsAgreeDynamic() {
        return isAgreeDynamic;
    }

    public void setIsAgreeDynamic(Integer isAgreeDynamic) {
        this.isAgreeDynamic = isAgreeDynamic;
    }

    public Integer getIsAgreeHome() {
        return isAgreeHome;
    }

    public void setIsAgreeHome(Integer isAgreeHome) {
        this.isAgreeHome = isAgreeHome;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "isAgreeLocation=" + isAgreeLocation +
                ", isAgreeInfo=" + isAgreeInfo +
                ", isAgreeDynamic=" + isAgreeDynamic +
                ", isAgreeHome=" + isAgreeHome +
                '}';
    }
}
