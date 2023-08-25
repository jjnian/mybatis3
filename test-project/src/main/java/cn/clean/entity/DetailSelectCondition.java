package cn.clean.entity;

import java.time.LocalDateTime;

public class DetailSelectCondition {
    private Integer loadNum;

    private Integer selectNum;

    private String sex;

    private String attr;

    private String status;

    private String type;

    private Integer ageMin;

    private Integer ageMax;

    private Double heightMin;

    private Double weightMin;

    private Double heightMax;

    private Double weightMax;

    private String province;

    private String city;

    public Integer getLoadNum() {
        return loadNum;
    }

    public void setLoadNum(Integer loadNum) {
        this.loadNum = loadNum;
    }

    public Integer getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(Integer selectNum) {
        this.selectNum = selectNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("".equals(sex)){
             this.sex = null;
        }else {
            this.sex = sex;
        }

    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        if ("".equals(attr)){
            this.attr = null;
        }else {
            this.attr = attr;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if ("".equals(status)){
            this.status = null;
        }else {
            this.status = status;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if ("".equals(type)){
            this.type = null;
        }else {
            this.type = type;
        }
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        if (ageMin != null && 0<ageMin && ageMin < 200){
            this.ageMin = ageMin;
        }else {
            this.ageMin = null;
        }

    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        if (ageMax != null && 0<ageMax && ageMax < 300){
            this.ageMax = ageMax;
        }else {
            this.ageMax = null;
        }
    }

    public Double getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(Double heightMin) {
        if (heightMin != null && 0<heightMin && heightMin < 300){
            this.heightMin = heightMin;
        }else {
            this.heightMin = null;
        }
    }

    public Double getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(Double weightMin) {
        if (weightMin != null && 0<weightMin && weightMin < 300){
            this.weightMin = weightMin;
        }else {
            this.weightMin = null;
        }
    }

    public Double getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(Double heightMax) {
        if (heightMax != null && 0<heightMax && heightMax < 300){
            this.heightMax = heightMax;
        }else {
            this.heightMax = null;
        }
    }

    public Double getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(Double weightMax) {
        if (weightMax != null && 0 < weightMax && weightMax < 300){
            this.weightMax = weightMax;
        }else {
            this.weightMax = null;
        }
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {

        if ("".equals(province)){
            this.province = null;
        }else {
            this.province = province;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if ("".equals(city)){
            this.city = null;
        }else {
            this.city = city;
        }
    }

    @Override
    public String toString() {

        return "MsgSelectBasis{" +
                "sex='" + sex + '\'' +
                ", attr='" + attr + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", ageMin=" + ageMin +
                ", ageMax=" + ageMax +
                ", heightMin=" + heightMin +
                ", weightMin=" + weightMin +
                ", heightMax=" + heightMax +
                ", weightMax=" + weightMax +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
