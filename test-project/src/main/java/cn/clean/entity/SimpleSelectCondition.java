package cn.clean.entity;

public class SimpleSelectCondition {
    private Integer loadNum;

    private Integer selectNum;

    private String sex;

    private String attr;

    public Integer getLoadNum() {
        return loadNum;
    }

    public void setLoadNum(Integer loadNum) {
        this.loadNum = loadNum;
    }

    public String getSex() {
        return sex;
    }

    public Integer getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(Integer selectNum) {
        this.selectNum = selectNum;
    }

    public void setSex(String sex) {
        if ("男".equals(sex) ||"女".equals(sex)){
            this.sex = sex;
        }else{
            this.sex = null;
        }

    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        if ("Z".equals(attr) || "B".equals(attr) || "双".equals(attr)){
            this.attr = attr;
        }else{
            this.attr = null;
        }
    }

    @Override
    public String toString() {
        return "MsgSelectSimple{" +
                "loadNum=" + loadNum +
                ", selectNum=" + selectNum +
                ", sex='" + sex + '\'' +
                ", attr='" + attr + '\'' +
                '}';
    }
}
