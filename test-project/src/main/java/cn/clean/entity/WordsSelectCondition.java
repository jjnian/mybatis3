package cn.clean.entity;

public class WordsSelectCondition {
    private Integer loadNum;

    private Integer selectNum;

    private String searchWords;

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

    public String getSearchWords() {
        return searchWords;
    }

    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }

    @Override
    public String toString() {
        return "WordsSelectCondition{" +
                "loadNum=" + loadNum +
                ", selectNum=" + selectNum +
                ", searchWords='" + searchWords + '\'' +
                '}';
    }
}
